
package minesweeper;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Finestra extends JFrame{
   
    private Menu menu;
    private Field field;
    
    public Finestra(){
        
        setSize(new Dimension(550, 450));
        setLocationRelativeTo(null);
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){}
        
        menu = new Menu(this);
        
        add(menu);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void avvia(int dimCampo, int numBombe){
        
        remove(menu);
        
        System.out.println("tolto menu");
        
        
        field = new Field(dimCampo, numBombe);
        add(field);
        
        repaint();
        
        System.out.println("aggiunto field");
        
    }
    
}
