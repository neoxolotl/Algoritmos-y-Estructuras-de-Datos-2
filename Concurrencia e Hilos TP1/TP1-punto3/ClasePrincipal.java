// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
// Descripcion:     
//    3. Desarrollar un programa que implemente una carrera de hilos, donde cada competidor muestre en 
//    pantalla su avance por medio de un contador. Y evaluar los resultados.

//
//
public class ClasePrincipal{
	public static void main(String[] args) {
		ClaseQueExtiendeDeThread hilo1 = new ClaseQueExtiendeDeThread(" Hilo 1");
		ClaseQueExtiendeDeThread hilo2 = new ClaseQueExtiendeDeThread(" Hilo 2");
		ClaseQueExtiendeDeThread hilo3 = new ClaseQueExtiendeDeThread(" Hilo 3");
		//paso los parametros.
		//
		hilo1.ValorDeLaCondicion(10);
		hilo2.ValorDeLaCondicion(10);
		hilo3.ValorDeLaCondicion(10);
		// Inicio los objetos
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
