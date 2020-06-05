 // Universidad M. Champagnat. 
// 
// Materia: 	Algoritmos y Estructuras de datos II
// Autor: 	Fernando G Sosa
// Año:		2020

 
import java.util.Random;
import java.util.Scanner;
 
public class Game {
 
        public static final String PIEDRA = "R";
        public static final String PAPEL = "P";
        public static final String TIJERAS = "T";




        
        /**
         * @param args
         */
        public static void main(String[] args) {
                String response = null;
                Scanner scan = new Scanner(System.in);

		Hilo1 hilo1=new Hilo1();
		Hilo2 hilo2=new Hilo2();


        //hilo1
	//se encarga de solicitar los datos al jugador. 
        hilo1.start();
        try{
            hilo1.sleep(10);

        }catch (InterruptedException e) {
                    System.out.println("Error en el hilo 1 "+e);
        }









                //loop through till the user is entering input
                while (scan.hasNext()) {

        		hilo2.start();
        		try{
            			hilo2.sleep(10);

        		}catch (InterruptedException e) {
        		            System.out.println("Error en el hilo 1 "+e);
        		}



            
                        response = scan.next().toUpperCase();
                        if (response.equals(PAPEL) || response.equals(PIEDRA)
                                        || response.equals(TIJERAS)) {
                                printDescision(response, getComputerPlay());
                        } else {
                                //exit game if user entered invalid input
                                System.out.println("Entrada invalida " + response);
                                System.out.println("Saliendo del juego");
                                scan.close();
                                System.exit(0);
                        }
                }




		
        }
        /**
         * decide the winner
         * */
        public static void printDescision(String personPlay, String computerPlay) {
                System.out.println("Computadora juega ->  " + computerPlay);
 
                if (personPlay.equals(computerPlay))
                        System.out.println("...Empate.!....");
                else if (personPlay.equals(PIEDRA)) {
                        if (computerPlay.equals(TIJERAS))
                                System.out.println("Piedra rompe Tijeras. Tu Ganas!!");
                        else if (computerPlay.equals(PAPEL))
                                System.out.println("Papel envuelve piedra. Tu Pierdes!!");
                } else if (personPlay.equals(PAPEL)) {
                        if (computerPlay.equals(TIJERAS))
                                System.out.println("Tijeras Cortan papel. Tu Pierdes!!");
                        else if (computerPlay.equals(PIEDRA))
                                System.out.println("Papel envuelve piedra. Tu Ganas!!");
                } else if (personPlay.equals(TIJERAS)) {
                        if (computerPlay.equals(PAPEL))
                                System.out.println("Tijeras cortan papel. Tu Ganas!!");
                        else if (computerPlay.equals(PIEDRA))
                                System.out.println("Piedra rompe tijeras. Tu pierdes!!");
                } else
                        System.out.println("Entrada invalida .");
        }
        /**
         * get computer's move
         * */
        public static String getComputerPlay(){


		int computerInt;
                String computerPlay="";
                Random generator = new Random();
                computerInt = generator.nextInt(3) + 1;
                if (computerInt == 1)
                        computerPlay = PIEDRA;
                else if (computerInt == 2)
                        computerPlay = PAPEL;
                else if (computerInt == 3)
                        computerPlay = TIJERAS;
               
                return computerPlay;

	
        }
 
}
