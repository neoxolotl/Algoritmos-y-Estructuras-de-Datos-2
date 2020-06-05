import java.io.*;

public class Hilo1 extends Thread{
    
        @Override
        public void run() {

            System.out.println("Hola bienvenido al juego Ta-te-ti");

                try{

                    Hilo1.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Error en la clase Hilo 1 " +e );

                }

            }

        }



