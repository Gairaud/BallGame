/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author gaira
 */
public class Raqueta extends Actor{

    public Raqueta(int w, int h, int x, int y, int dx, int dy) {
        super(x, y, dx, dy);
        this.w = w;
        this.h = h;
    }

   
    
    public int w;
    public int h;
     public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    @Override
    public void move (Rectangulo r){
    
       if(x>750){
           dx = -dx;
       }
       if(x<100){
           dx = -dx;
       }
     
        x = x +dx;
        y = y +dy;
    
    }
}
