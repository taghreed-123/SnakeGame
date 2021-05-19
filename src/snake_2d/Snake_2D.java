/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_2d;

/**
 *
 * @author PC
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Snake_2D extends JFrame {
    public Snake_2D() {
        createAndShowGUI();
    }
     private void createAndShowGUI() {
 
      
        GameDrawer gameDrawer = new GameDrawer();
 
       
        add(gameDrawer);
 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Snake_2D();
            }
        });
    }

    }
    

