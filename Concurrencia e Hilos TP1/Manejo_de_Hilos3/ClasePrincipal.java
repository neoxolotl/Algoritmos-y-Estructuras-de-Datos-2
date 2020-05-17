

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
		
		hilo1.sleep(3000);
		}catch(InterruptedException e){
			System.out.println("Error en el hilo1 " + e);

		}



		hilo2.start();


		try {

		hilo2.sleep(2000);

		}catch(InterruptedException e){
			System.out.println("Error en el hilo2 " + e);
		}

	}
}
