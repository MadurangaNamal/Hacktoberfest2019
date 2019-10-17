/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MThread extends Thread{
    


    @Override
    public void run() {
       // super.run(); //To change body of generated methods, choose Tools | Templates.
       show();
    }

    private void show() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    int x=0;
    while(x<10){
         for(int z=10;z>x;z--){
                 System.out.print(" ");
                }
            for(int y=0;y<(2*x)-1;y++){
               
        System.out.print("*");
            }
        x++;
            System.out.println("");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      while(x>0){
         for(int z=10;z>x;z--){
                 System.out.print(" ");
                }
            for(int y=0;y<(2*x)-1;y++){
               
        System.out.print("*");
            }
        x--;
            System.out.println("");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
    
}
