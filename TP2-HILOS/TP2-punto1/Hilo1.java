// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020


import java.io.*;

public class Hilo1 extends Thread{
    
        @Override
        public void run() {
            for( int i=0; i<= 5; i++) {
		System.out.print("SO");


                try{

                    Hilo1.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("Error en la clase Hilo 1 " +e );

                }


/*
 * Graba Archivo
 */
		    File file = new File("write.txt");
    			FileWriter writer;
    			try {
        		writer = new FileWriter(file, true);
        		PrintWriter printer = new PrintWriter(writer);
        		printer.append("SO");
        		printer.close();
    			} catch (IOException e) {
        		// TODO Auto-generated catch block
       			 e.printStackTrace();
    			}

            }

        }

}


