/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import sk.stu.fiit.gui.MainWIndow;

/**
 *
 * @author jarni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("D:\\Skola/duplikacie.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("img = " + img);
        System.out.println("Mam image");
        
        MainWIndow mainw = new MainWIndow();
        mainw.setVisible(true);
       
        
        
    
    }
    
}
