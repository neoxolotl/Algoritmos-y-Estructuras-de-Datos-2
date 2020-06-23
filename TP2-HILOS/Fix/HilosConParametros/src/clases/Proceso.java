/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author fsosa
 */
public class Proceso extends Thread {
    /*
    Variable de ambito global para recibir un param
    al ser global no es inicializada
    variable num_int 
    */
    
     int num_int; 
     
     public Proceso(String NombreHilo){
         super(NombreHilo);
     
     }
     
     
    /*----------------------PROCESO DEL HILO ----------------------*/
    /*debido al polimorfismo uso */
    @Override
    public void run () { /*Todo el proceso que ejecuta el hilo debe estar dentro de run */
    
        for (int i=0; i<=num_int; i++){
            System.out.println (i + this.getName() );
        }
        System.out.println("");
    }
     /*----------------------PROCESO DEL HILO ----------------------*/
 
    /*Creo un metodo, lo que va a hacer es recibir a traves de params 
    para que los pueda buardar entro de una variable en este caso num_int
    Puede tener diferente comportamiento por debido al paso de variables. 
    */
    
    public void ValorDeLaCondicion (int valor){
        this.num_int = valor;
    }
    
    
}
