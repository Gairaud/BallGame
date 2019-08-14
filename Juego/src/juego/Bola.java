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
    
    @Override
    public void  move (Model b){
        
       
        if((y<b.a.y) && (dy>0) && (y+t >= b.a.y) && (b.a.x<x+t && x-t < b.a.x + b.a.w)){
            
            dy = -dy;
           
        
        }
        if(x-(t*2)>=b.r.getH()||x-(t*2)<b.r.getX()){
            dx = -dx;
        
        }
        if(y-(t*2)>=b.r.getW()||y-(t*2)<b.r.getY()){
            dy = -dy;
        
        }
       
     
        x = x +dx;
        y = y +dy;
        
   
     
        
        
    
    
    }

   
}
