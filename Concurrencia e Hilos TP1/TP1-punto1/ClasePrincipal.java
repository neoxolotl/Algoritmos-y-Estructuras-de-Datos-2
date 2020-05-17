// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
//Desarrollar una clase que implemente la interfaz ​ Runnable​ . 
//De esta forma podremos crear múltiples hilos que ejecuten el mismo 
//método ​ run ​ de esta clase accediendo al mismo espacio de memoria
//de este objeto. Ejecutar el programa, ver lo que hace.

// para poder usar lo que esta en una clase completamente diferente 
// debemos usar instancias. 

public class ClasePrincipal {
    
    public static void main(String[] args){
	//creo la instancia para crear un hilo  
	//lo debo hacer siempre que uso el extends Threads   
	
	ClaseThreads hilo1 = new ClaseThreads();    

	//cuando uso implements runable 
	//debo crear un objeto de la clase Theads porque no estoy heredando
	//de la clase Threads. 
	// le pongo un parametro para que vaya a la clase de proceso 2 
	// porque  solo lo uso cuando dice Implements Runable 
	
	Thread hilo2 = new Thread(new ClaseQueImplementaInterfazRunnable());

	Thread hilo3 = new Thread(new ClaseQueImplementaInterfazRunnable());

	//despues uso un metodo que permita el arranque de los hilos 
	// los pongo a hilo1 e hilo2 
	// cada vez que ejecute el programa se va a a ejecutar de forma 
	// diferente
	
	hilo1.start();
	hilo2.start();
        hilo3.start();	

    }
}
