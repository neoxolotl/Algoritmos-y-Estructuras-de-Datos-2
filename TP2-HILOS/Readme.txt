/-----------CREAR HILOS-------------------------
/*
public class Main
{
  // arguments are passed using the text field below this editor
  public static void main (String [] args) {
        new ThreadExtends("Pepe").start();
        new ThreadExtends("Juan").start();
        System.out.println("Termina thread extends");
        
        new Thread ( new ThreadImplements() , "Santi").start();
        new Thread ( new ThreadImplements() , "Mati").start();
        System.out.println("Termina thread implements");
  }
}

class ThreadExtends extends Thread {
    
    public ThreadExtends(String str) {
        super(str);
    }
    
    public void run() {
        try
        {
            for (int i = 0; i < 10 ; i++)
            {
                System.out.println(i + " " + getName());
                sleep(100);
            }
        }catch(Exception e){}
        
    }
}

class ThreadImplements implements Runnable {
    public void run() {
        try
        {
            for (int i = 0; i < 5 ; i++)
            {    
                System.out.println(i + " " +Thread.currentThread().getName());
                //sleep(100);
            }
        }catch(Exception e){}
    }
}
*/
//-----------PRIORIDAD---------------------------

/*public class Main{
    public static void main(String[] args) {
    PrioridadHilos ph1= new PrioridadHilos("Prioridad Alta");
    PrioridadHilos ph2= new PrioridadHilos("Prioridad Baja");
    PrioridadHilos ph3= new PrioridadHilos("Prioridad Normal #1");
    PrioridadHilos ph4= new PrioridadHilos("Prioridad Normal #2");
    PrioridadHilos ph5= new PrioridadHilos("Prioridad Normal #3");
    //Establecer prioridades
        ph1.setPriority(Thread.NORM_PRIORITY+2);
        ph2.setPriority(Thread.NORM_PRIORITY-2);
     //Deje ph3, ph4 y ph5 en el nivel de prioridad normal predeterminado
     //Comenzar los hilos
        ph1.start();
        ph2.start();
        ph3.start();
        ph4.start();
        ph5.start();
    try {
        ph1.join();
        ph2.join();
        ph3.join();
        ph4.join();
        ph5.join();
    }catch (InterruptedException exc){
        System.out.println("Hilo principal interrumpido.");
    }
        System.out.println("\nHilo de alta prioridad contó hasta "+ph1.contar);
        System.out.println("Hilo de baja prioridad contó hasta "+ph2.contar);
        System.out.println("Hilo de normal prioridad #1 contó hasta "+ph3.contar);
        System.out.println("Hilo de normal prioridad #2 contó hasta "+ph4.contar);
        System.out.println("Hilo de normal prioridad #3 contó hasta "+ph5.contar);
    }
}

class PrioridadHilos extends Thread {
    int contar;
    static boolean stop=false;

    //Construye un nuevo hilo.
    PrioridadHilos(String nombre){
        super(nombre);
        contar=0;
    }
    //Punto de entrada de hilo.
    public void run(){
        //System.out.println(hilo.getName()+" iniciando.");
        do {
            contar++;
        }while (stop==false&&contar<10000000);
        stop=true;
        //System.out.println("\n"+ hilo.getName()+" terminado.");
    }
}*/

//--------------sentencia sincronizada-------------

/*class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrumpido");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this); t.start();
    }
    
    public void run() {
        synchronized(target) { target.call(msg);}
    }
}

public class Main {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hola");
        Caller ob2 = new Caller(target, "Sincronizado");
        Caller ob3 = new Caller(target, "Mundo");
        //try {
            //ob1.t.join();
            //ob2.t.join();
            //ob3.t.join();
        //} catch(InterruptedException e) {
            //System.out.println("Interrumpido");
        //}
    }
}*/

//--------------metodo sincronizada-------------

/*
public class Main {
	 public static void main(String[] args) {
		 Contenedor c = new Contenedor ();
		 Productor produce = new Productor (c);
		 Consumidor consume = new Consumidor (c);
		 produce.start();
		 consume.start();
	 }
}


class Productor extends Thread {
	private Contenedor contenedor;
	public Productor (Contenedor c) 
	{
		contenedor = c;
	}
	public void run() {
		for (int i = 0; i < 10; i++) 
		{
			contenedor.put(i);
			System.out.println("Productor. put: " + i);
			
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) { }
		}
	}
}

class Consumidor extends Thread {
	private Contenedor contenedor;
	public Consumidor (Contenedor c) 
	{
		contenedor= c;
	}
	
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = contenedor.get();
			System.out.println("Consumidor. get: " + value);
		}
	}
}

class Contenedor{
	private int dato;
	private boolean hayDato = false;
	
	public synchronized int get() {
		while (hayDato == false) {
			try {
				// espera a que el productor coloque un	valor
				wait(); 
			}
			catch (InterruptedException e) { }
		}
		
		hayDato = false;
		// notificar que el valor ha sido consumido
		notifyAll();
		return dato;
	}
	
	public synchronized void put(int valor) {
		while (hayDato == true) {
			try {
				// espera a que se consuma el dato
				wait();
			} catch (InterruptedException e) { }
		}
		dato = valor;
		hayDato = true;
		// notificar que ya hay dato.
		notifyAll();
	}
}*/
