// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
// Descripcion:     
// 2. Desarrollar una clase que extienda de la clase ​ Thread​ . De esta forma podremos crear múltiples hilos que ejecuten el mismo 
// método ​ run ​ de esta clase accediendo al mismo espacio de memoria de este objeto. Ejecutar el programa, ver lo que hace.
//
//
public class ClasePrincipal{
	public static void main(String[] args) {
		ClaseQueExtiendeDeThread hilo1 = new ClaseQueExtiendeDeThread(" Hilo 1");
		ClaseQueExtiendeDeThread hilo2 = new ClaseQueExtiendeDeThread(" Hilo 2");
		ClaseQueExtiendeDeThread hilo3 = new ClaseQueExtiendeDeThread(" Hilo 3");
		//paso los parametros.
		//
		hilo1.ValorDeLaCondicion(5);
		hilo2.ValorDeLaCondicion(10);
		hilo3.ValorDeLaCondicion(10);
		// Inicio los objetos
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
