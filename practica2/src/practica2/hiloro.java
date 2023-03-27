/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro
 */
public class hiloro extends Thread{
    int vproduc, contp;
    
       public void setDato2(int vproduc){
       this.vproduc=vproduc;      
        }    
    
    public void run(){
        synchronized(this){            
        try {           
                wait();
                for (int x = 0; x < 30; x++) {
                System.out.println(vproduc*1000);
                this.sleep(vproduc*1000);
//                System.out.println("funcionaaa"); 
                contp=contp+1;
//                mostrarlabelsv();              
            }     
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilov.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }    
}
