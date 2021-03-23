/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import sk.stu.fiit.gui.MainWindow;
import sk.stu.fiit.gui.MainWindow;
import sk.stu.fiit.models.employees.Education;
import sk.stu.fiit.models.employees.Programmer;
import sk.stu.fiit.models.employees.Specialist;

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
        
        /*BufferedImage img = null;
        try {
            img = ImageIO.read(new File("D:\\Skola/duplikacie.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("img = " + img);
        System.out.println("Mam image");
        */
        //MainWindow mainw = new MainWindow();
        //mainw.setVisible(true);
        
        Education edu = Education.STREDNE_BEZ;
        
        System.out.println(edu.name());
        System.out.println(edu);
        
        MainWindow nie = new MainWindow();
        nie.setVisible(true);
        
        Programmer programmer = new Programmer();
        programmer.setManDay(15.5);
        System.out.println(programmer.getClass());
        

    
    }
    
}
