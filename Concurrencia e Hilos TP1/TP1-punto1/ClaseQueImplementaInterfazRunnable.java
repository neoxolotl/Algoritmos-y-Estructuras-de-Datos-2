// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
//Desarrollar una clase que implemente la interfaz <200b> Runnable<200b> . 
//De esta forma podremos crear múltiples hilos que ejecuten el mismo 
//método <200b> run <200b> de esta clase accediendo al mismo espacio de memoria
//de este objeto. Ejecutar el programa, ver lo que hace.

// para poder usar lo que esta en una clase completamente diferente 
// debemos usar instancias. 

//
//Segunda forma de implementar un hilo
//

//segunda forma mediante implements porque vamos a implementar la interfaz
// Runnable
// lo que le decimos es que implemente Runnable
public class ClaseQueImplementaInterfazRunnable implements Runnable {

	//Tenemos que hacer uso del metodo run
	//tenemos que usar override. 
	@Override
	public void run (){
		for (int i=0; i<=5; i++){
			System.out.println("Proceso "+ i +" desde Runnable ");
		}

	}

}
