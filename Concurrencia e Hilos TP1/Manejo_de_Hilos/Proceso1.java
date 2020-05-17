// Primera forma de implementar un hilo mediante HERENCIA  
//
// Vamos a Heredar de la clase padre Thread que ya viene en java 
public class Proceso1 extends Thread{

	//tenemos que hacer uso de un metodo que viene en en la clase Thread
	// run ya viene declarado en Thead
	// aplica polimorfismo capacidad de que un metodo se comporte diferente
	// dependiendo la instancia. 
	// usamos override por el polimorfismo 
	
	@Override 
	public void run () {
		for (int i=0; i<=5; i++){
		   System.out.println("Proceso1");
		}
			
	}

	//con esto tengo un hilo


}
