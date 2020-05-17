//
// Implementación de una clase Runnable 
//  
// Debemos utilizar Implements porque vamos a implementar la clase Runnable
//
// 
// 
public class Proceso implements Runnable {

	//Hacemos uso del metodo Run y utilizamos @Override para sobreescribir la clase 
	@Override
	public void run (){
		for (int i=0; i<=5; i++){
			System.out.println("Proceso ...");
		}

	}

}
