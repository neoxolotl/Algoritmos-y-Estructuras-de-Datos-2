// Universidad M. Champagnat. 
// 
// Materia:     Algoritmos y Estructuras de datos II
// Autor:       Fernando G Sosa
// Año:         2020
//  
// Descripcion:     
// 4. En base a ejercicio anterior, asignar prioridades a los distintos competidores. Y evalua
//
public class ClaseQueExtiendeDeThread extends Thread{

	int numero_int;
//Como al poner this.getName() muestra por pantalla 
//0Thread-1
//1Therad-1
//Tengo que poner un constructor. 

	public ClaseQueExtiendeDeThread (String NombreHilo){
		super(NombreHilo);

	}
//Uso @override para sobreescribir el metodo 
	@Override
	public void run() {
		for(int i=0;i<= numero_int; i++) {
			System.out.println("Interaccion nro "+ i + this.getName());
		}

	}

	public void ValorDeLaCondicion(int valor){
		this.numero_int = valor;

	} 
}
