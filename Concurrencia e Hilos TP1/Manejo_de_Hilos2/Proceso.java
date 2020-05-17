public class Proceso extends Thread{

		
	int numero_int;


	//como al poner this.getName() muestra por pantalla 
	//0Thread-1
	//1Thread-1
	//Voy a crear un constructor 
	//
	

	public Proceso (String NombreHilo){
		super(NombreHilo);
	
	}



	@Override
	public void run() {
		for(int i=0;i<= numero_int; i++) {
			System.out.println(i + this.getName());
		}

	}


	public void ValorDeLaCondicion(int valor){
		this.numero_int = valor;
	
	
	} 
}
