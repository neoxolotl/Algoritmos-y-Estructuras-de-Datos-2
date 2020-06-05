import java.io.*;


public class Hilo2 extends Thread{


    @Override
    public void run() {
        for( int i=0; i<= 5; i++) {
            //System.out.print("O");
	 
	    System.out.print("-Hilo2");

            try{

                Hilo1.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error en la clase Hilo 2 " +e );
            }



/*
 * Graba Archivo
 */
    File file = new File("write.txt");
    FileWriter writer;
    try {
        writer = new FileWriter(file, true);
        PrintWriter printer = new PrintWriter(writer);
        printer.append("O");
        printer.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }




        }

    }
    
}
