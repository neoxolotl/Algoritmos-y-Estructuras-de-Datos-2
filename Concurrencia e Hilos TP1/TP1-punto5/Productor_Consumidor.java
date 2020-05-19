// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
// Descripcion:     
// Sincronizar hilos. Realizar un ejemplo de sincronización de hilos, donde un hilo sea el productor de un contenido y el otro hilo en consumidor. Ambos hilos deberán trabajar conjunto, donde el primero entrega un número y queda a espera del segundo hilo, que lo muestre en pantalla. Una vez que el número fue consumido, el hilo inicial vuelve a generar un número y se repite el ciclo unas 10 iteraciones
//
//
  
import java.util.LinkedList; 
  
public class Productor_Consumidor { 
    public static void main(String[] args) 
        throws InterruptedException 
    { 
        // Objeto de una clase que tiene ambos produce() y metodos consume()  
        final PC pc = new PC(); 
  
        // Crear un hilo productor
        Thread t1 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.produce(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Crear un hilo consumidor
        Thread t2 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.consume(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Iniciar ambos hilos 
        t1.start(); 
        t2.start(); 
  
        // t1 finaliza antes de   t2 
        t1.join(); 
        t2.join(); 
    } 
  
    // Esta clase tiene una lista, productor (agrega elementos a la lista y consume (elimina elementos
    public static class PC { 
  
        // Crea una lista compartida por el productor y consumidor  su tamaño es 1
	// Tambien le puedo dar el tamaño que dese para que consuma el consumidor. 
	//
        LinkedList<Integer> list = new LinkedList<>(); 
        int capacity = 1; 
  
        // Funcion llamada por el hilo productor 
        public void produce() throws InterruptedException 
        { 
            int value = 0;
	   //se puede poner while (true) para que se produzca indefinidamente  
            while (value<10) { 
                synchronized (this) 
                { 
                    // el hilo productor espera mientra la lista este llena
                    while (list.size() == capacity) 
                        wait(); 
  
                    System.out.println("Productor produce-"
                                       + value); 
  
                    // inserta los trabajos en la lista 
                    list.add(value++); 
  
                    // notifica al hilo consumidor que ahora puede comenzar a consumir
                    notify(); 
  
                    // el sleep es para facilitar el funcionamiento y poder entender bien que hace 
                    Thread.sleep(1000); 
                } 
            } 
        } 
  
        // Funcion llamada por el hilo consumidor
        public void consume() throws InterruptedException 
        { 
            while (true) { 
                synchronized (this) 
                { 
  
    		    // el hilo consumidor espera mientras la lista este vacia 
                    while (list.size() == 0) 
                        wait(); 
  
                    // para recuperar el primer trabajo en la lista
                    int val = list.removeFirst(); 
  
                    System.out.println("Consumidor consume-"
                                       + val); 
  
                    // levantar o despertar el hilo productor
                    notify(); 
  
                    // y dormir
                    Thread.sleep(1000); 
		
                } 
            } 
        } 
    } 
} 
