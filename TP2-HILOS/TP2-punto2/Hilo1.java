public class Hilo1 extends Thread{
    
        @Override
        public void run() {

            System.out.println(
                "Jugamos Piedra papel o Tijeras!\n"
                + "Elija su opcion.\n"
                +"Piedra = R, Paper= P, and Tijeras = T.\n");



                try{

                    Hilo1.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Error en la clase Hilo 1 " +e );

                }


           

	    }
}




