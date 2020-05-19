public class Hilo3 extends Thread{

    @Override
    public void run() {
        for( int i=0; i<= 5; i++) {
            System.out.print("S");


            try{

                Hilo1.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error en la clase Hilo 3 " +e );
            }

        }

    }

}

