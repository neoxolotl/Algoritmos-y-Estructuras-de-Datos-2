

public class ClasePrincipal {

	public static void main (String[] args) {
		

		// primer estado cuando se crea el hilo pero no esta ejecutado
		Hilo_Proceso hilo1 = new Hilo_Proceso(); 
		Hilo_Proceso hilo2 = new Hilo_Proceso();


		//segundo estado cuando se manda a ejecutar
		hilo1.start();
		


//Nota
//try y catch solo se usan por el metodo sleep. 

		try {

		//3er estado bloqueo duermo el hilo por 1 segundo ya  en milisegundos.
		//
		
		hilo1.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Error en el hilo 1 " + e);

		}



		hilo2.start();
// en este caso vamos a colocar el metodo stop para provocar la muerte del hilo2 	
// si quiero puedo comentar la siguiete linea para que se ejecute. 
		hilo2.stop();

		try {

		hilo2.sleep(1000);

		}catch(InterruptedException e){
			System.out.println("Error en el hilo 2 " + e);
		}




	}
}
