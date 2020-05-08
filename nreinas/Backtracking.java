
// Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020
//  
// Descripcion: Implemnetación de algoritmo de Backtracking solucion n-reinas. 
// 
// Pendientes: 	mejorar el diseño de la interfaz
// 
// Run: java Backtracking
//



class Backtracking {

  // =============================Funcion Esta_Atacada ========================
  // validamos que no se encuentre amenazada por ninguna otra reina 
  // revisamos filas y columnas asi como diagonales y contradiagonales. 
  //
  public static boolean Esta_Atacada(int i, int j, int board[][], int N) {
    int k, l;
    // ---------Verificamos para la columna j
    for(k=1; k<=i-1; k++) {
      if(board[k][j] == 1)
        return true;
    }

    // ---------Verificamos para la diagonal superior derecha
    // 
    k = i-1;
    l = j+1;
    while (k>=1 && l<=N) {
      if (board[k][l] == 1)
        return true;
      k=k+1;
      l=l+1;
    }

    //-------------Verificamos para la diagonal superior izquierda. 
    k = i-1;
    l = j-1;
    while (k>=1 && l>=1) {
      if (board[k][l] == 1)
        return true;
      k=k-1;
      l=l-1;
    }

    return false;
  }

  //==========================Funcion nQueen 
  // Esta funcion recibe como parametros columnas y la matriz 
  // lleva un Array de solucion 
  // etapa que indica en que posicion del array me estoy moviendo. 
  // 
  //
  public static boolean nQueen(int row, int n, int N, int board[][]) {
    if (n==0)
      return true;

    for (int j=1; j<=N; j++) {
      if(!Esta_Atacada(row, j, board, N)) {
        board[row][j] = 1;

        if (nQueen(row+1, n-1, N, board))
          return true;

        board[row][j] = 0; //backtracking
      }
  }
  return false;
  }

  // ==============================================Instanciar objetos  y comenzar 
  public static void main(String[] args) {
    int[][] board = new int[5][5];

    for(int i=0;i<=4;i++) {
      for(int j=0;j<=4;j++)
        board[i][j] = 0;
    }

    nQueen(1, 4, 4, board); //llamado de la funcion nQueen

    //---- Imprimir matriz 
    //
    for(int i=1;i<=4;i++) {
      for(int j=1;j<=4;j++)
        System.out.print(board[i][j]+"\t");
      System.out.println("");
    }
    }
}
