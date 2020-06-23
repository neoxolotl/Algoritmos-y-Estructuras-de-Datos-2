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

import java.util.Random;

public class avance {
    
    static componente[] losComponentes;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     //Vel
        losComponentes[0].setVelocidad(vel[rnd.nextInt(4)]);
        losComponentes[1].setVelocidad(vel[rnd.nextInt(4)]);
        losComponentes[2].setVelocidad(vel[rnd.nextInt(4)]);
        losComponentes[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losComponentes[0].setAvance(ava[rnd.nextInt(4)]);
        losComponentes[1].setAvance(ava[rnd.nextInt(4)]);
        losComponentes[2].setAvance(ava[rnd.nextInt(4)]);
        losComponentes[3].setAvance(ava[rnd.nextInt(4)]);
    
    }//
    
    static public void registrarComponentes(){
        rnd= new Random();
        
        int[] vel={240,250,255,245};
        int[] ava={13,15,16,14};
        losComponentes = new componente[4];
        
        losComponentes[0] = new componente(0,0,0,0,0,"-");
        losComponentes[1] = new componente(0,0,0,0,0,"-");
        losComponentes[2] = new componente(0,0,0,0,0,"-");
        losComponentes[3] = new componente(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        losComponentes[0].setCodigo(101);
        losComponentes[1].setCodigo(102);
        losComponentes[2].setCodigo(103);
        losComponentes[3].setCodigo(104);
        //nombres
        losComponentes[0].setNombre("CPU");
        losComponentes[1].setNombre("DISCO");
        losComponentes[2].setNombre("MEMORIA");
        losComponentes[3].setNombre("RED");
        //CoordX
        losComponentes[0].setCoorX(frmInicio.lblComponente1.getLocation().x);
        losComponentes[1].setCoorX(frmInicio.lblComponente2.getLocation().x);
        losComponentes[2].setCoorX(frmInicio.lblComponente3.getLocation().x);
        losComponentes[3].setCoorX(frmInicio.lblComponente4.getLocation().x);
        //CoordX
        losComponentes[0].setCoorY(frmInicio.lblComponente1.getLocation().y);
        losComponentes[1].setCoorY(frmInicio.lblComponente2.getLocation().y);
        losComponentes[2].setCoorY(frmInicio.lblComponente3.getLocation().y);
        losComponentes[3].setCoorY(frmInicio.lblComponente4.getLocation().y);
        //Vel
        losComponentes[0].setVelocidad(vel[rnd.nextInt(4)]);
        losComponentes[1].setVelocidad(vel[rnd.nextInt(4)]);
        losComponentes[2].setVelocidad(vel[rnd.nextInt(4)]);
        losComponentes[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losComponentes[0].setAvance(ava[rnd.nextInt(4)]);
        losComponentes[1].setAvance(ava[rnd.nextInt(4)]);
        losComponentes[2].setAvance(ava[rnd.nextInt(4)]);
        losComponentes[3].setAvance(ava[rnd.nextInt(4)]);
        //
        losComponentes[0].setTiempo(0);
        losComponentes[1].setTiempo(0);
        losComponentes[2].setTiempo(0);
        losComponentes[3].setTiempo(0);
        
        //
    }//
    
    
    static void iniciar(){
        
        /*Clase principal que se encarga de lanzar los 4 hilos*/
        
        
        hiloUno h1= new hiloUno(losComponentes[0].getNombre());
        h1.start();
        
        hiloUno h2= new hiloUno(losComponentes[1].getNombre());
        h2.start();
        
        hiloUno h3= new hiloUno(losComponentes[2].getNombre());
        h3.start();
        
        hiloUno h4= new hiloUno(losComponentes[3].getNombre());
        h4.start();
    }//iniciar           
            
    
    
    }//class
    