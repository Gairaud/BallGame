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
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N= 20;
        Rectangulo r = new Rectangulo(100,100,800,400);
        Bola b = new Bola(200,150,25,40,30);
        Raqueta raq = new Raqueta (50,15,400,400,80,0);
        System.out.println(renderBall(b));
        b.move(r);
        System.out.println(renderBall(b));
        String html = "";
        html += "<svg height = 1000 width = 2000> " + "\n";
        html += "<rect x=" + r.getX() + " y="+r.getY()+" width=" + r.getW()+" height="+ r.getH()
                + " fill=white stroke=black />"+ "\n";
        for (int i = 0;i<N;i++){
            html+="<circle cx="+b.getX()+" cy="+b.getY()+ " r="+b.getT() + " />" + "\n";
            html+=renderRacket(raq);
            b.move(r);
            raq.move(r);
           
        }
        html += "</svg>";
        System.out.println(html);
        
        
        
    }
    static String renderBall(Bola b){
    
        return "(X:" + b.getX() + " , Y:" +b.getY()+")";
    
    }
    static String renderRacket(Raqueta r){
    
         return"<rect x=" + r.getX() + " y="+r.getY()+" width=" + r.getW()+" height="+ r.getH()
                + " fill=blue stroke=black />"+ "\n";
    }
    
}
