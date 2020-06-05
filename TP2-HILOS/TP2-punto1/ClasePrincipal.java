
// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020


import java.io.*;
// cabeceras para manejo de archivos 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ClasePrincipal {

	// synchronized
    public synchronized static  void main (String[] args)  throws IOException {

	//defino los dos hilos 
        Hilo1 hilo1=new Hilo1();
        Hilo2 hilo2=new Hilo2();

	LeerFichero o = new LeerFichero();
        o.muestraContenido("write.txt");

        

	//llamo los dos hilos y aplico sleep para que se puedan visualizar 
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
            hilo2.sleep(10);

        }catch (InterruptedException e) {
                    System.out.println("Error en el hilo 2 "+e);
        }





    }


}
