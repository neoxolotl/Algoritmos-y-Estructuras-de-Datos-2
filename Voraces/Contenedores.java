/* Materia: 	Algoritmos y Estructuras de datos 2
 * Autor: 	Fernando G. Sosa. 
 * Año: 	2020
 * TP:		Nro. 1 (Algoritmos voraces)
 * Notas:	Se ha implementado el Algoritmo Voraz (similar a cambio de monedas) en este caso determina la cantidad de contenedores de cerveza que 
 * 		serán entregados dado una cantidad de litros iniciales. 
 *
 * */


import java.util.Arrays;

public class CambioDecervezas{

	/*------------Algoritmo---------------*/	

    private static int getPosicionMejorCerveza(double total, double[] cervezas){
        double resultado=total;
        int contador=0;
        for (int i=0; i<cervezas.length; i++)
            if ((resultado>(total-cervezas[i]))&&(total-cervezas[i]>=0)){
                resultado=(total-cervezas[i]);
                
                
                contador=i;
                System.out.println("Flag contador -> "+contador);
            }
        return contador;
    }

    public static int combinarcervezas(double total){
        //double[] cervezas={0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1.00, 2.00}; // Definimos las cervezas que usaremos
        double[] cervezas={0.5, 0.750, 1.0, 2.00, 5.00}; // Definimos las cervezas que usaremos

        System.out.println(Arrays.toString(cervezas));
        double total1=total;

        //flag1
        //System.out.println("flag1"+total1);

        int contador=0;
        while (total1>=0.00){
            int posicionCerveza=getPosicionMejorCerveza(total1, cervezas); // Buscamos la mejor Cerveza asociada al total
            
            //flag2
            System.out.println("Flag2 -> "+posicionCerveza);

            total1=total1-cervezas[posicionCerveza]; // Restamos la Cerveza usada al total
            contador+=1; // Contamos las cervezas que llevamos
        }
        return contador;
    }

    /* --------------------- Test  --------------------- */
    public static void main(String[] args){
        System.out.println(combinarcervezas(10.900));
    }

}
