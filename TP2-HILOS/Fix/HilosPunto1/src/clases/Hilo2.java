/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author fsosa
 */
public class Hilo2 extends Thread{

    @Override
    public void run() {
        for( int i=0; i<= 5; i++) {
	    System.out.println("SA");


  	   try{

                Hilo1.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error en la clase Hilo2 " +e );
            }



/*
 * Graba Archivo
 */
		File file = new File("write.txt");
		FileWriter writer;
		try {
    		writer = new FileWriter(file, true);
    		PrintWriter printer = new PrintWriter(writer);
    		printer.append("SA-");
    		printer.close();
		} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
		}


        	}

	}
}
