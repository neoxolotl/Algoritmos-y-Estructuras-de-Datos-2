
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
 
 
public class ImplementacionQuickSort {          
     
    private int array[];									//Declaro un Array de enteros
    private int longitud;									//Declaro una longitud como entero
 


    //=========================Metodo de ordenamiento ==========================//
    public void sort(int[] Array_de_entrada) {
         
        if (Array_de_entrada == null || Array_de_entrada.length == 0) {
            return;
        }
        this.array = Array_de_entrada;
        longitud = Array_de_entrada.length;
        quickSort(0, longitud - 1);
    }
 
    //=========================Metodo Quicksort=================================//
    private void quickSort(int menorIndice, int mayorIndice) {
         
        int i = menorIndice;
        int j = mayorIndice;

	// Calculo el numero del pivote. Se esta tomando el pivote como el numero del indice del medio
        // calculate pivot number, I am taking pivot as middle index number

	int pivot = array[menorIndice+(mayorIndice-menorIndice)/2];


	// Dividir en dos arrays 
	// Divide into two arrays
        while (i <= j) {

	     //
             // En cada iteración, identificaremos un número del lado izquierdo que
             // es mayor que el valor de pivote, y también identificaremos un número
             // desde el lado derecho, que es menor que el valor de pivote. Una vez que la búsqueda
             // está hecho, luego intercambiamos ambos números.
             //




            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (menorIndice < j)
            quickSort(menorIndice, j);
        if (i < mayorIndice)
            quickSort(i, mayorIndice);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        ImplementacionQuickSort sorter = new ImplementacionQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
