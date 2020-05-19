// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
// Descripcion:     
// 4.- En base a ejercicio anterior, asignar prioridades a los distintos competidores. Y evalua
//
//
public class ClasePrincipal{
	public static void main(String[] args) {
		ClaseQueExtiendeDeThread hilo1 = new ClaseQueExtiendeDeThread(" Hilo 1");
hilo1.ValorDeLaCondicion(10);
hilo1.start();
hilo1.setPriority(2);

		ClaseQueExtiendeDeThread hilo2 = new ClaseQueExtiendeDeThread(" Hilo 2");
hilo2.ValorDeLaCondicion(10);
hilo2.start();
hilo2.setPriority(8);

		ClaseQueExtiendeDeThread hilo3 = new ClaseQueExtiendeDeThread(" Hilo 3");
hilo3.ValorDeLaCondicion(10);
hilo3.start();
hilo3.setPriority(10);
      

	}
}
