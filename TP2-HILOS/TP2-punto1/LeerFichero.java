// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020
// 
// Descrip: clase para leer ficheros. 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }

    //public static void main(String[] args) throws IOException {
    //    muestraContenido("write.txt");
    //}
   
}
