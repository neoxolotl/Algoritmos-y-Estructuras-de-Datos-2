// para poder usar lo que esta en una clase completamente diferente 
// debemos usar instancias. 

public class ClasePrincipal {
    
    
    
    public static void main(String[] args){
    
	//creo la instancia para crear un hilo  
	//lo debo hacer siempre que uso el extends Threads   
	

	//cuando uso implements runable 
	//debo crear un objeto de la clase Theads porque no estoy heredando
	//de la clase Threads. 
	// le pongo un parametro para que vaya a la clase de proceso 2 
	// porque  solo lo uso cuando dice Implements Runable 
	
	Thread hilo_1 = new Thread(new Clase_Implementa_Runnable());


	hilo_1.Inicializar()


	//despues uso un metodo que permita el arranque de los hilos 
	// los pongo a hilo1 e hilo2 
	// cada vez que ejecute el programa se va a a ejecutar de forma 
	// diferente
	hilo_1.start(); 

    }
}
