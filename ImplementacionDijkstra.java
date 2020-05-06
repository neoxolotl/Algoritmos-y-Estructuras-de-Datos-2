// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020
//  
// Descripcion: Implemnetación de algoritmod de Dijkstra para hallar el camino mas corto de cada nodo. 
// 
// Pendientes: 	Tomar el resultado y almacenarlo en un archivo para su posterior analisis. 
// 
// Run: java ImplementacionDijkstra
//
 

import java.util.*;
import java.lang.*;
import java.io.*;

public class ImplementacionDijkstra{
   
    static final int V=8; 								// Número de Nodos o vértices del problema 

    //--->> si pongo 18 debo poner la matriz que esta comentada y marcada aqui como (**) ya que cuenta con mas cantidad de datos. 
    

    /* ===================Implemento el Algoritmo Buscando las menores distancias =======================*/
    private int Calcular_Minima_Distancia(int distancias[], Boolean procesados[]){		// fc devuelve int recibe Vector distancias y procesados  
        int min=Integer.MAX_VALUE, min_index=-1; 					// Inicializo el valor mínimo
        for (int v=0; v<V; v++) 							// Recorro y verifico que los procesados == falso y sus distan 
            if (procesados[v] == false && distancias[v] <= min){			// cias <= al min. 
                min=distancias[v];							//
                min_index=v;								//	
            }
        return min_index;
    }
    
    /*====================Print de solucion + Estetica===============================================*/
    private void Imprimir_Solucion(int distancias[], int n){
	System.out.println("----------------------------------------------------------");    
        System.out.println("|   Nro.Nodo     |     Distancia que hay desde el inicio  |");
	System.out.println("----------------------------------------------------------");
        for (int i=0; i<V; i++)	        	                                         //Recorre los valores para mostrar
            System.out.println(i+" \t\t |"+distancias[i]);				 // 
 

    }
    
    /*================ Implementa el algoritmo de ImplementacionDijkstra dado un grafo con adyacencias ========*/
    private void dijkstra(int grafo[][], int nodoRaiz){
        int distancias[]=new int[V]; 							// Vector de distancias solución del algoritmo, distancias[i] 
											// es la ruta más corta desde nodoRaiz hasta i
	Boolean procesados[]=new Boolean[V]; 						// procesados[i] será true si el vértice i está incluido en el 
											//camino más corto

        for (int i=0; i<V; i++){ 							// Inicializamos todas las distancias como infinito y stpSet[] a false
            distancias[i]=Integer.MAX_VALUE; 						// Función de Interger
 
            
	    procesados[i]=false;
        }
        distancias[nodoRaiz]=0; 							// fuerzo a 0 la distancia del nodo raiz
        for (int count=0; count<V-1; count++){ 						// Encuentra el camino más corto en todos los vértices
            int u=Calcular_Minima_Distancia(distancias, procesados);
            procesados[u]=true; 							// Marca el vértice seleccionado como procesado
            for (int v=0; v<V; v++) 							// Actualiza el valor de las distancias del grafo adyacente para el 
		    									// vértice seleccionado
                if (!procesados[v] && grafo[u][v]!=0 &&
                    distancias[u]!=Integer.MAX_VALUE &&
                    distancias[u]+grafo[u][v]<distancias[v])
                    distancias[v]=distancias[u]+grafo[u][v];
        }
        Imprimir_Solucion(distancias, V);						// Imprime el array de distancias
    }

    /* =============== Seccion de pruebas del Algoritmo ========================================*/
    public static void main (String[] args){



//V=18				/*                               1  1  1  1  1  1  1  1 */
//				/* 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7 */
//       int grafo[][]=new int[][] {{0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
//                         /*1*/    {6, 0, 0, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},  
//                         /*2*/    {0, 1, 0, 0, 0, 9, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*3*/    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*4*/    {0, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*5*/    {0, 0, 7, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*6*/    {0, 0, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*7*/    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0},
//                         /*8*/    {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
//                         /*9*/    {0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 0, 1, 6, 0, 0, 0, 0},
//                         /*10*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0},
//                         /*11*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 8, 0, 0, 0},
//                         /*12*/   {0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0},
//                         /*13*/   {0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*14*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*15*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//                         /*16*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
//                         /*17*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 1, 0, 0, 0, 0}};


  



        int grafo[][]=new int[][]{{0, 4, 1, 7, 3, 0, 0, 0}, 
                                  {4, 0, 0, 0, 0, 0, 7, 0},  
                                  {1, 0, 0, 0, 0, 7, 0, 0},
                                  {7, 0, 0, 0, 0, 0, 0, 0},
                                  {3, 0, 0, 0, 0, 0, 4, 1},
                                  {0, 0, 7, 0, 0, 0, 0, 0},
                                  {0, 7, 0, 0, 0, 0, 0, 0},
                                  {0, 0, 0, 0, 4, 0, 0, 5},
                                  {0, 0, 0, 0, 1, 0, 5, 0}};


  
/*
 * Este es un Ejemplo de Grafo filas de 0 a n
 * static final int V=8;
 *
 *
 * */
       

        ImplementacionDijkstra d=new ImplementacionDijkstra();
        d.dijkstra(grafo, 0);									// paso el grafo y el nodo inicializador 
    }
    
}








