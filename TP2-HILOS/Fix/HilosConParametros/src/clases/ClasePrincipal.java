
package clases;

public class ClasePrincipal {
    public static void main(String[] args){
    
        Proceso hilo1 = new Proceso(" Hilo1"); 
        Proceso hilo2 = new Proceso(" Hilo2");
        
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);

        hilo1.start();
        hilo2.start();
        
        
        
        
    }
}
