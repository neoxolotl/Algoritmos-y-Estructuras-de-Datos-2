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
		ClaseQueExtiendeDeThread hilo2 = new ClaseQueExtiendeDeThread(" Hilo 2");
		ClaseQueExtiendeDeThread hilo3 = new ClaseQueExtiendeDeThread(" Hilo 3");
		//paso los parametros.
		//


		hilo1.ValorDeLaCondicion(10);
		hilo2.ValorDeLaCondicion(10);
		hilo3.ValorDeLaCondicion(10);
		// Inicio los objetos

//hilo1.setPriority(1);
//hilo2.setPriority(Thread.NORM_PRIORITY+2);


		hilo1.start();
		hilo2.start();
		hilo3.start();

     	hilo1.setPriority(2);
        hilo2.setPriority(5);
        hilo3.setPriority(8);

        
        System.out.println("Prioridad del hilo 1 : " + hilo1.getPriority());  
//2
        System.out.println("Prioridad del hilo 2 : " + hilo2.getPriority()); 
//5
        System.out.println("Prioridad del hilo 3 : " + hilo3.getPriority());
//8

       
        System.out.print(Thread.currentThread().getName()+": ");
        System.out.println("Prioridad del hilo Main : "
               + Thread.currentThread().getPriority());



	}
}
