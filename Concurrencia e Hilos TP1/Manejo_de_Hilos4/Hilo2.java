public class Hilo2 extends Thread{


    @Override
    public void run() {
        for( int i=0; i<= 5; i++) {
            //System.out.print("O");
	    System.out.print("O");

            try{

                Hilo1.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error en la clase Hilo 2 " +e );
            }

        }

    }
    
}
