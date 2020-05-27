import java.util.Random;


public class Hilo2 extends Thread{
    
        @Override
        public void run() {



 		System.out.println("Entre su jugada: ");





                try{

                    Hilo1.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Error en la clase Hilo 1 " +e );

                }


           

	    }
}




