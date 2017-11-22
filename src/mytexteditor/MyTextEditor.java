/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytexteditor;

import View.ventana;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author AlumnoDAM
 */
public class MyTextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ventana TextEditor = new ventana();
        TextEditor.setLocationRelativeTo(null);
        TextEditor.setVisible(true);
        TextEditor.setBounds(500,300,550,400);
        TextEditor.setResizable(false);
        TextEditor.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
