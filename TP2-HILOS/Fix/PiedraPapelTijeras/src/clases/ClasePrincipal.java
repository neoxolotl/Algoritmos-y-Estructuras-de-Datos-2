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
//public class ClasePrincipal {
  
/**
 *
 */
//package com.shreesoft.game;
 
//import java.util.Random;
// leer por teclado
//import java.util.Scanner;
 
/**
 * @author srihari
 *
 */
public class ClasePrincipal {
 
        public static final String ROCK = "R";
        public static final String PAPER = "P";
        public static final String SCISSORS = "S";
 
        /**
         * @param args
         */
       // public static void main(String[] args)  {
        public static void main(String[] args) throws InterruptedException{
                Proceso hilo1 = new Proceso(" Hilo1");
                Proceso hilo2 = new Proceso(" Hilo2");
                
                hilo1.ValorDeLaCondicion(5);
                hilo2.ValorDeLaCondicion(5);
 
             hilo1.start();
             hilo2.start();
             
             hilo1.join();
             hilo2.join();
             
            System.out.println("Jugador 1 = "+hilo1.getValue() );
            System.out.println("Jugador 2 = "+hilo2.getValue() );

/*basico resultado*/            
/*
            if(hilo1.getValue()==hilo2.getValue())
            {
                System.out.println("empate");
            }else {
                System.out.println("alguno gano");
            }
*/             
                    
            if(hilo1.getValue()==hilo2.getValue())
            {
                System.out.println("Empate");
            }else {
                System.out.println("Gano");
            }  

            
            
           // personPlay hilo1.getValue()
           // computerPlay   hilo2.getValue()       
                
           
                if (hilo1.getValue()==hilo2.getValue())
                        System.out.println("It's a tie!");
                else if (hilo1.getValue()=="R" ) {
                        if (hilo2.getValue() == "S" )
                                System.out.println("Rock crushes scissors - Roca rompe tijeras -  Jugador1 Win!! - Jugador1 Gana!!");
                        else if (hilo2.getValue()=="P")
                                System.out.println("Paper eats rock - Papel envuelve roca - Jugador1 lose!! -Jugador1 Pierde!!");
                } else if (hilo1.getValue()=="P") {
                        if (hilo2.getValue()=="S")
                                System.out.println("Scissor cuts paper.- Tijera corta papel- Jugador1  lose!! -Jugador1 Pierde!!");
                        else if (hilo2.getValue()=="R")
                                System.out.println("Paper eats rock.- Papel envuelve roca Jugador 1 Win!!- Jugador1 Gana!!");
                } else if (hilo1.getValue()=="S") {
                        if (hilo2.getValue() =="P")
                                System.out.println("Scissor cuts paper. - Tijera corta papel- Jugador 1 Win!!. Jugador1 Gana");
                        else if (hilo2.getValue()=="R")
                                System.out.println("Rock breaks scissors.-Roca rompe tijeras- Jugador 1 Lose!!");
                } else
                        System.out.println("Invalid user input.");            

               

  
            
  
                
        }
}   
    
    
    
