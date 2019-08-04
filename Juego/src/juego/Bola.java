/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author ESCINF
 */
public class Bola extends Actor {

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
   
    int t;
    public Bola(int x, int y, int t, int dx, int dy) {
        
        super(x,y,dx,dy);
        this.t = t;
        
    }
    
    public void  move (Rectangulo b){
        if(x>b.getW()){
            dx = -dx;
        
        }
        if (y>b.getH()){
        
            dy = -dy;
            
        } 
     
        x = x +dx;
        y = y +dy;
        
    
    
    }

   
}
