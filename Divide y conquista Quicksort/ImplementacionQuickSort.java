
// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020
//  
// Descripcion: Implemnetación de algoritmod de QuickSort para efectuar el ordenamiento de un vector dado.  
// 
// Pendientes: 	mejorar el diseño de la interfaz
// 
// Run: java ImplementacionQuickSort
//
 
    
 
public class ImplementacionQuickSort {
     
    private int array[];
    private int length;
								
    //==========================Funcion sort  =========================================
    // Recibe como parametro un int Array del tipo vector con valores enteros. 
    // 
    // Verifica que el array no sea nulo o igual a 0. 
    // Luego el dato que traje en la variable Input_Array lo guardo en una variable para enviarlo 
    // a otra funcion que en este caso se llama quickSort
    //
    //
    public void sort(int[] Input_Array) {

   
	    System.out.println ("\nArray de ....."+Input_Array.length+".... Elementos");

        if (Input_Array == null || Input_Array.length == 0) {
            return;
        }
        this.array = Input_Array;
        length = Input_Array.length;
        quickSort(0, length - 1);
    }
 
    //===========================funcion quickSort =============================================
    //Recibe como parametro el IndiceMenor y el IndiceMayor lowerIndex y higherIndex. 
    //
    // Los valores que recibe los asignamos a las variables enteras i y j con las que calcularemos el pivote
    // el calculo del pivote se determina dividiendo en dos el vector recibido con la formula
    // 
    //  IndiceMenor+(IndiceMayor-IndiceMenor)/2
    //
    //
    //
    //
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // ------------------------------Calculo el pivote 
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // -----------------------------Se divide en dos el array 
	
        while (i <= j) {

		//En cada iteración, identificaremos un número del lado izquierdo que
             	//es mayor que el valor de pivote, y también identificaremos un número
             	//desde el lado derecho, que es menor que el valor de pivote. Una vez que la búsqueda
             	//está hecho, luego intercambiamos ambos números.
		

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange_Numberss(i, j);

                // movemos el indice a la siguiente posicion en ambos lados.
		//

                i++;
                j--;
            }
        }
        // Llamamos la funcion quickSort() de forma recursiva 
	//
	
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    // Funcion exchange_Numbers se encarga de realizar el intercambio de ambos numeros. 
    //
    
    private void exchange_Numberss(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // ======================================================================Inicio del programa 
    // Inicializacion del objeto y comienzo 
    //
    public static void main(String a[]){
         
        ImplementacionQuickSort sorter = new ImplementacionQuickSort();
        int[] input = {6,60,90,9,8,98,32,43,55,21,1,2,4,79,80};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
