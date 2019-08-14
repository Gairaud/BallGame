/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Observable;
/**
 *
 * @author gaira
 */
public class Model extends Observable {
    
    public Rectangulo r;
    public Bola b;
    public Raqueta a;
    
    public Model(){
        
        r = new Rectangulo (100,100,400,400);
        b = new Bola (200,150,25,40,30);
        a = new Raqueta (40,10,300,370,0,0);
        
    
    
    
    }
    public void step(){
    
        
        b.move(this);
        a.move(this);
        this.setChanged();
        this.notifyObservers();
        
        
    
    
    
    }
    
    public void addObserver(java.util.Observer o) {
    
    
        super.addObserver(o);
        setChanged();
        notifyObservers();
    
    
    
    
    
    
    
    }

}
