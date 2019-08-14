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
    public static void main(String[] args) throws InterruptedException {
      
   
       
       Model model = new Model();
       View view = new View();
       Controller controller = new Controller (model,view);
       view.setVisible(true);
       for (;;){
           
           Thread.sleep(1000);
           model.step();
       
       }
      
}
}
