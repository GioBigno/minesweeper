
package minesweeper;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;


public class Field extends JPanel{
    
    private int dimCampo;
    private int numBombe;
    
    public Field(int dimCampo, int numBombe){
        
        this.dimCampo = dimCampo;
        this.numBombe= numBombe;
        
        setPreferredSize(new Dimension(getWidth(), getHeight()));
        setBackground(Color.red);
        repaint();
    }
    
}
