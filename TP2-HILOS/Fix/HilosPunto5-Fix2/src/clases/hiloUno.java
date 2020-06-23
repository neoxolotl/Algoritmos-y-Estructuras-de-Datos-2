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

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.plaf.SliderUI;


public class hiloUno extends Thread{

    
    public hiloUno(String name) {
        this.setName(name);
    }//constr
    
    public void run(){
        
        
    /*definiendo estaba la ganza  */
    
        if(getName().equals("CPU")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblComponente1.setLocation(frmInicio.lblComponente1.getLocation().x+avance.losComponentes[0].getAvance(),frmInicio.lblComponente1.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblComponente1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(avance.losComponentes[0].getVelocidad());
                    
                    if(frmInicio.lblComponente1.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        avance.losComponentes[0].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+avance.losComponentes[0].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblComponente1.setLocation(frmInicio.lblComponente1.getLocation().x,frmInicio.lblComponente1.getLocation().y);
             
             this.stop();
        }//if
              
        
        if(getName().equals("DISCO")){
            long ti=System.currentTimeMillis();
for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblComponente2.setLocation(frmInicio.lblComponente2.getLocation().x+avance.losComponentes[1].getAvance(),frmInicio.lblComponente2.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblComponente1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(avance.losComponentes[1].getVelocidad());
                    
                    if(frmInicio.lblComponente2.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        avance.losComponentes[1].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+avance.losComponentes[1].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblComponente2.setLocation(frmInicio.lblComponente2.getLocation().x,frmInicio.lblComponente2.getLocation().y);        
        this.stop();
        }//if
        
        if(getName().equals("MEMORIA")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblComponente3.setLocation(frmInicio.lblComponente3.getLocation().x+avance.losComponentes[2].getAvance(),frmInicio.lblComponente3.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblComponente1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    /*Mi pantalla de auditoria */
                    
                    sleep(avance.losComponentes[2].getVelocidad());
                    
                    if(frmInicio.lblComponente3.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        avance.losComponentes[2].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+avance.losComponentes[2].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblComponente3.setLocation(frmInicio.lblComponente3.getLocation().x,frmInicio.lblComponente3.getLocation().y);                
        this.stop();
        }//if
        
        if(getName().equals("RED")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblComponente4.setLocation(frmInicio.lblComponente4.getLocation().x+avance.losComponentes[3].getAvance(),frmInicio.lblComponente4.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblComponente1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(avance.losComponentes[3].getVelocidad());
                    
                    if(frmInicio.lblComponente4.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        avance.losComponentes[3].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+avance.losComponentes[3].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblComponente4.setLocation(frmInicio.lblComponente4.getLocation().x,frmInicio.lblComponente4.getLocation().y);                
        this.stop();
        }//if
        
    }//run

    
   

        
    }//class%  