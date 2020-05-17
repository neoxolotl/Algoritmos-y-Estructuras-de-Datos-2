//
//Segunda forma de implementar un hilo
//

//segunda forma mediante implements porque vamos a implementar la interfaz
// Runnable
// lo que le decimos es que implemente Runnable
public class Proceso2 implements Runnable {

	//Tenemos que hacer uso del metodo run
	//tenemos que usar override. 
	@Override
	public void run (){
		for (int i=0; i<=5; i++){
			System.out.println("Proceso 2");
		}

	}

}
