import java.io.*;

public class Hilo2 extends Thread{
    
        @Override
        public void run() {

         
            System.out.println("Fin del Juego Gracias por jugar!");

                try{

                    Hilo1.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Error en la clase Hilo 2 " +e );

                }

            }

        }



