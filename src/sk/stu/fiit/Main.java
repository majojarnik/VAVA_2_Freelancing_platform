/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.gui.MainWindow;
import sk.stu.fiit.models.Employer;
import sk.stu.fiit.models.JobOffer;
import sk.stu.fiit.models.employees.Administrator;
import sk.stu.fiit.models.employees.Education;
import sk.stu.fiit.models.employees.Programmer;
import sk.stu.fiit.models.employees.Security;
import sk.stu.fiit.models.employees.Specialist;

/**
 *
 * @author jarni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
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
        
        List<String> certif = new ArrayList<String>();
        certif.add("Java certificate");
        certif.add("Python certificate");
        certif.add("Security certificate");
        
        Employer employer = new Employer("Tesla", "Auta", 45000, ImageIO.read(new File("D:\\Skola/duplikacie.png")));
        Data.getAllEmployers().add(employer);
        
        JobOffer jobOffer = new JobOffer("Programátor", 150.20, 2.5, Education.STREDNE_S, certif, "Java", employer, 5);
        Data.getAllOffers().add(jobOffer);
        JobOffer jobOffer2 = new JobOffer("Bezpečnostný konzultant", 170.20, 6, Education.VYSOKE_1, certif, true, employer, 5);
        Data.getAllOffers().add(jobOffer2);
        JobOffer jobOffer3 = new JobOffer("Administrátor", 150.20, 0.5, Education.ZAKLADNE, certif, "SAP", "Java", employer, 5);
        Data.getAllOffers().add(jobOffer3);
        
        JobOffer jobOffer4 = new JobOffer("Programátor", 200.20, 3.6, Education.STREDNE_S, certif, "Python", employer, 5);
        Data.getAllOffers().add(jobOffer4);
        JobOffer jobOffer5 = new JobOffer("Bezpečnostný konzultant", 50.20, 15.5, Education.STREDNE_BEZ, certif, false, employer, 5);
        Data.getAllOffers().add(jobOffer5);
        JobOffer jobOffer6 = new JobOffer("Administrátor", 10.20, 8.5, Education.VYSOKE_2, certif, "SAP", "C#", employer, 5);
        Data.getAllOffers().add(jobOffer6);
        
        Specialist spec1 = new Programmer("Programátor1", "Slovenská", 150.20, 2.5, Education.STREDNE_S, certif, "Java");
        Data.getAllSpecialists().add(spec1);
        Specialist spec2 = new Security("Bezpečnostný konzultant", "Slovenská", 170.20, 6, Education.VYSOKE_1, certif, true);
        Data.getAllSpecialists().add(spec2);
        Specialist spec3 = new Administrator("Administrátor", "Slovenská", 150.20, 0.5, Education.ZAKLADNE, certif, "SAP", "Java");
        Data.getAllSpecialists().add(spec3);
        
        Specialist spec4 = new  Programmer("Programátor", "Slovenská", 200.20, 3.6, Education.STREDNE_S, certif, "Python");
        Data.getAllSpecialists().add(spec4);
        Specialist spec5 = new Security("Bezpečnostný konzultant", "Slovenská", 50.20, 15.5, Education.STREDNE_BEZ, certif, false);
        Data.getAllSpecialists().add(spec5);
        Specialist spec6 = new Administrator("Administrátor", "Slovenská", 10.20, 8.5, Education.VYSOKE_3, certif, "SAP", "C#");
        Data.getAllSpecialists().add(spec6);


        
        MainWindow nie = new MainWindow();
        nie.setVisible(true);
        
        Programmer programmer = new Programmer();
        programmer.setManDay(15.5);
        System.out.println(programmer.getClass());
        
        
    
    }
    
}
