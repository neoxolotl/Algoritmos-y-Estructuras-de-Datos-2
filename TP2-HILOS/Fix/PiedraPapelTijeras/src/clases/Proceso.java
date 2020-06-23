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

import static clases.ClasePrincipal.PAPER;
import static clases.ClasePrincipal.ROCK;
import static clases.ClasePrincipal.SCISSORS;
import java.util.Random;


public class Proceso  extends Thread{
    
        /*
    Variable de ambito global para recibir un param
    al ser global no es inicializada
    variable num_int 
    */

     
        int computerInt;
        String computerPlay="";
    private int num_int;
    
     
     
      
     public Proceso(String NombreHilo){
            //super(NombreHilo);
         this.computerPlay= NombreHilo;
         this.computerInt=0;
     }
     
     
    /*----------------------PROCESO DEL HILO ----------------------*/
    /*debido al polimorfismo uso */

    /**
     *
     * @return
     */

    @Override
    public  void run () { 
        /*Todo el proceso que ejecuta el hilo debe estar dentro de run */


        
        Random generator = new Random();
        computerInt = generator.nextInt(3) + 1;
        
        // TAKE OF THIS SECTOR
        if (computerInt == 1)
                        computerPlay = ROCK;
        else if (computerInt == 2)
                        computerPlay = PAPER;
        else if (computerInt == 3)
                        computerPlay = SCISSORS;
                 //para devolver void 
                //System.out.println(computerPlay);  
        
            //computerPlay;    
            //return computerPlay;
        //TAKE OF THIS SECTOR 
 
    }
     /*----------------------PROCESO DEL HILO ----------------------*/
 
    /*Creo un metodo, lo que va a hacer es recibir a traves de params 
    para que los pueda buardar entro de una variable en este caso num_int
    Puede tener diferente comportamiento por debido al paso de variables. 
    */
    
    public void ValorDeLaCondicion (int valor){
        this.num_int = valor;
    }

 /*   void computerPlay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   */ 
    public String getValue(){
        return computerPlay;
    }
    
    
}
