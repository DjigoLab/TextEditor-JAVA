/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

/**
 *
 * @author AlumnoDAM
 */
public class menuOptions {
    
    JMenuItem item1,item2,item3,item4;
    String help;
    
    public void changeTypography ( JTextPane jtxp, JMenuItem item){
        
        
        String itemtypo = item.getText();
        
        Font font = new Font (jtxp.getFont().getFontName(),jtxp.getFont().getStyle(),jtxp.getFont().getSize());
        switch(itemtypo){
            case "Arial":
                font = new Font ("Arial",jtxp.getFont().getStyle(),jtxp.getFont().getSize());
                jtxp.setFont(font);
                break;
                
                 case "Verdana":
                font = new Font ("Verdana",jtxp.getFont().getStyle(),jtxp.getFont().getSize());
                jtxp.setFont(font);
                break;
                
                case "Courier":
                font = new Font ("Courier New",jtxp.getFont().getStyle(),jtxp.getFont().getSize());
                jtxp.setFont(font);
                break;
                
                case "Bold":
                font = new Font (jtxp.getFont().getFontName(),Font.BOLD,jtxp.getFont().getSize());
                jtxp.setFont(font);
                break;
                
                case "Italic":
                font = new Font (jtxp.getFont().getFontName(),Font.ITALIC,jtxp.getFont().getSize());
                jtxp.setFont(font);
                break;
                
                case "12":
                font = new Font (jtxp.getFont().getFontName(),jtxp.getFont().getStyle(),12);
                jtxp.setFont(font);
                break;
                
                case "16":
                font = new Font (jtxp.getFont().getFontName(),jtxp.getFont().getStyle(),16);
                jtxp.setFont(font);
                break;
                
                case "18":
                font = new Font (jtxp.getFont().getFontName(),jtxp.getFont().getStyle(),18);
                jtxp.setFont(font);
                break;
                
                case "20":
                font = new Font (jtxp.getFont().getFontName(),jtxp.getFont().getStyle(),20);
                jtxp.setFont(font);
                break;
        }
        
        
        
        
    }
    
    public void editChan(JTextPane jtxp,JMenuItem item){
        String itemname = item.getText();
        
        switch(itemname){
            
            case "Cut":
                jtxp.cut();
        break;
            case "Copy":
                 jtxp.copy();
        break;
            case "Paste":
                jtxp.paste();
        break;}
    }
    
    
}
