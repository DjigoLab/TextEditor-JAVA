/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.menuOptions;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

/**
 *
 * @author AlumnoDAM
 */
public class ventana extends JFrame{
    
     menuOptions opts = new menuOptions();
    
    JMenuBar menubar;
    JMenu font,style,size,edit;
    JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12;
    
    JTextPane txteditor;
    
    public ventana(){
        
          this.setLayout(new BorderLayout());
          
          Editor();
        menuTXT();
        
        
        
        
    }
    
    public void menuTXT(){
    
    menubar = new JMenuBar();
    font = new JMenu("Font");
    style = new JMenu ("Style");
    size = new JMenu("Size");
    edit = new JMenu ("Edit");
    
    menubar.add(font);
    menubar.add(style);
    menubar.add(size);
    menubar.add(edit);
    
     item1 = new JMenuItem("Arial");
     item1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item1);
        }
         });
     item2 = new JMenuItem("Courier");
     item2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item2);
        }
         });
     item3 = new JMenuItem("Verdana");
     
     item3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item3);
        }
         });
     
     font.add(item1);
     font.add(item2);
     font.add(item3);
     
     item4 = new JMenuItem("Bold");
     
     item4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor, item4);
        }
    });
     
     item5 = new JMenuItem("Italic");
     
     item5.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor, item5);
        }
    });
    
     style.add(item4);
     style.add(item5);
     
     item6 = new JMenuItem("12");
     
     item6.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item6);
        }
         });
     
     item7 = new JMenuItem("16");
     
     item7.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item7);
        }
         });
     
     item8 = new JMenuItem("18");
     item8.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item8);
        }
         });
     
     item9 = new JMenuItem("20");
     item9.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.changeTypography(txteditor,item9);
        }
         });
     
     size.add(item6);
     size.add(item7);
     size.add(item8);
     size.add(item9);
     
     item10 = new JMenuItem("Cut");
     item10.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.editChan(txteditor,item10);
        }
         });
     item11 = new JMenuItem("Copy");
     item11.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.editChan(txteditor,item11);
        }
         });
     item12 = new JMenuItem("Paste");
     item12.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            opts.editChan(txteditor,item12);
        }
         });
     
     
     
     edit.add(item10);
     edit.add(item11);
     edit.add(item12);
    
             add(menubar,BorderLayout.NORTH);

     
    }
    
    
    public void Editor(){
    
    txteditor = new JTextPane();
    add(txteditor,BorderLayout.CENTER);}
           
   
    
    
    
}
