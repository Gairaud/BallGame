/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import javax.swing.JFrame;

/**
 *
 * @author gaira
 */
public class View extends JFrame implements java.util.Observer {
    
    Model model;
    Controller controller;
    public View(){
        this.setSize(800,600);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public Model getModel(){
        return model;
    }
    public void setModel(Model model){
        this.model = model;
        model.addObserver(this);
    }
    public Controller getController(){
        return controller;
    }
    public void setController(Controller controller){
        this.controller = controller;
    }
    @Override
    public void update (Observable o, Object arg){
    
        this.repaint();
    
    }
    @Override
    public void paint (Graphics g){
        
        super.paint(g);
        this.renderModel(model,g);
        
    }
    void renderModel(Model m, Graphics media){
    
        renderRectangle(m.r,media);
        renderRacket(m.a,media);
        renderBall(m.b, media);
    
    }
    void renderRacket(Raqueta r, Graphics media){
    
       media.setColor(Color.blue);
       media.fillRect(r.x, r.y, r.w, r.h);
    }
    void renderBall (Bola b, Graphics media){
        media.setColor(Color.red);
        media.fillOval(b.x-b.t, b.y-b.t, 2*b.t, 2*b.t);
        
    }
    void renderRectangle(Rectangulo r, Graphics media){
       media.setColor(Color.black);
       media.drawRect(r.x, r.y, r.w, r.h);
    }
}
