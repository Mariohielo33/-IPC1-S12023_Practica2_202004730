/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Pedro
 */
public class Hilo extends Thread{
    
    JLabel eti;
    
    public Hilo(JLabel cronometro){
        this.eti=cronometro;
    }
    public  void run(){
        try{
            int x=0;
            while(ventana.inicioHilo==true){
                Thread.sleep(1000);
                System.out.println(x+"epa");
                ejecturaHilo(x);
                x++;
            }
        }catch(Exception e){
            System.out.println("Exception en el hilo: "+ e.getMessage());
        }
    }
    
    public void ejecturaHilo(int x){
//        System.out.println(x+" " + Thread.currentThread().getName());
        ventana.segundos++;
        if (ventana.segundos>59) {
            ventana.segundos=0;
            ventana.minutos++;
        }
        String textSeg="",textMin="",textHora="";
        if (ventana.segundos<10) {
            textSeg="0"+ventana.segundos;  
        }else{
           textSeg=""+ventana.segundos; 
        }
        if (ventana.minutos<10) {
            textMin="0"+ventana.minutos;        
        }else{
           textMin=""+ventana.minutos; 
        }

        String reloj=textHora+":"+textMin+":"+textSeg;
        eti.setText(reloj);
    }
    

}
