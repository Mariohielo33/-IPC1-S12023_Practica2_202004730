/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.logging.Level;
import java.util.logging.Logger;
//import practica2.hiloro;
//import practica2.ventana;
/**
 *
 * @author Pedro
 */
public class Hilov extends Thread{

    private int vprodu;
    private int contv,inicio2;
    
       public void setDato1(int vprodu){
       this.vprodu=vprodu;      
       
        }
//       public int getcontv(){
//       return contv;      
//        }
//       public void setDato(int contv){
//       this.contv=contv;      
//        }       
       
       
       
    public void run(){
        synchronized(this){            
        try {           
                wait();
                for (int x = 0; x < 30; x++) {
                System.out.println(vprodu*1000);
                this.sleep(vprodu*1000);

                obtenerini2();
                    if (inicio2==1) {
                        
                    }                
                contv=contv+1;
                mostrarlabelsv();              
            }     
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    public void debloq(){    
        synchronized(this){
        notify();
        
        }
    }
    
    public void mostrarlabelsv(){
     ventana v = new ventana();
//     contv=contv+1;
     v.obtenercon(contv);
     v.mostrar2();
    }
    public void obtenerini2(){
       ventana v = new ventana();
       v.obtenerinir(inicio2);
    }
}

