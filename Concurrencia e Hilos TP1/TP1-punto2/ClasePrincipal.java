

public class ClasePrincipal{
	
	public static void main(String[] args) {
		
		ClaseQueExtiendeDeThread hilo1 = new ClaseQueExtiendeDeThread(" Hilo1");
		ClaseQueExtiendeDeThread hilo2 = new ClaseQueExtiendeDeThread(" Hilo2");
		ClaseQueExtiendeDeThread hilo3 = new ClaseQueExtiendeDeThread(" Hilo3");




		//paso los parametros.
		//
		hilo1.ValorDeLaCondicion(5);
		hilo2.ValorDeLaCondicion(10);
		hilo3.ValorDeLaCondicion(10);


		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
