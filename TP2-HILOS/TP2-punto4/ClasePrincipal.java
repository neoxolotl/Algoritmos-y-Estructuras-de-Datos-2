// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020

/*para leer archivo */
import java.io.*;

public class ClasePrincipal {

    public static void main (String[] args){
        Hilo1 hilo1=new Hilo1();
        Hilo2 hilo2=new Hilo2();
        Hilo3 hilo3=new Hilo3();
        Hilo4 hilo4=new Hilo4();




        //hilo1
        hilo1.start();
        try{
            hilo1.sleep(10);

        }catch (InterruptedException e) {
                    System.out.println("Error en el hilo 1 "+e);
        }

        //hilo2
        hilo2.start();
        try{
            hilo1.sleep(10);

        }catch (InterruptedException e) {
                    System.out.println("Error en el hilo 2 "+e);
        }

        //hilo3
        hilo3.start();
        try{
            hilo1.sleep(10);

        }catch (InterruptedException e) {
                    System.out.println("Error en el hilo 3 "+e);
        }

        //hilo4
        hilo4.start();
        try{
            hilo1.sleep(10);

        }catch (InterruptedException e) {
                    System.out.println("Error en el hilo 4 "+e);
        }



/*Inicio lee archivo 
 *
 * */
/*Variables para lectura de archivo*/
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;


      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("write.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
            System.out.println(linea);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{
            if( null != fr ){
               fr.close();
            }
         }catch (Exception e2){
            e2.printStackTrace();
         }
      }

/*Fin de lectura de archivo
 * 
 * */

    }

}
