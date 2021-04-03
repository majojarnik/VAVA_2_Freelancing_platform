/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.gui.MainWindow;
import sk.stu.fiit.models.Employer;
import sk.stu.fiit.models.JobOffer;
import sk.stu.fiit.models.Lease;
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
    
    public static void test(){
        // Certificates 
        List<String> certif1 = new ArrayList<String>();
        certif1.add("Java certificate");
        certif1.add("Python certificate");
        certif1.add("Security certificate");
        
        List<String> certif2 = new ArrayList<String>();
        certif2.add("Skype certificate");
        certif2.add("Python certificate");
        
        List<String> certif3 = new ArrayList<String>();
        certif3.add("Java certificate");
        
        List<String> certif4 = new ArrayList<String>();
        certif4.add("Rajes certificate");
        certif4.add("Neutrogena certificate");
        certif4.add("Adidas certificate");
        certif4.add("Python certificate");
        certif4.add("Java certificate");
        
        List<String> certif5 = new ArrayList<String>();
        certif5.add("Python certificate");
        
        BufferedImage imgA = null;
        BufferedImage imgB = null;
        BufferedImage imgC = null;
        BufferedImage imgM = null;
        BufferedImage imgT = null;
        try {
            imgA = ImageIO.read(new File("images/a.png"));
            imgB = ImageIO.read(new File("images/b.png"));
            imgC = ImageIO.read(new File("images/c.png"));
            imgM = ImageIO.read(new File("images/m.png"));
            imgT = ImageIO.read(new File("images/t.png"));
        } catch (IOException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            return;
        }
        
        // Employers
        Employer amazon = new Employer("Amazon", "Eshop", 60000, imgA);
        Data.getAllEmployers().add(amazon);
        Employer barneys = new Employer("Barneys", "Oblečenie", 45000, imgB);
        Data.getAllEmployers().add(barneys);
        Employer cnn = new Employer("CNN", "Media", 5000, imgC);
        Data.getAllEmployers().add(cnn);
        Employer microsoft = new Employer("Microsoft", "Počítače", 45000, imgM);
        Data.getAllEmployers().add(microsoft);
        Employer tesla = new Employer("Tesla", "Auta", 45000, imgT);
        Data.getAllEmployers().add(tesla);

        
        // Offers
        JobOffer jobOffer = new JobOffer("Programátor", 150.20, 2.5, Education.STREDNE_S, certif2, "Java", tesla, 2);
        Data.getAllOffers().add(jobOffer);
        JobOffer jobOffer2 = new JobOffer("Bezpečnostný konzultant", 170.20, 6, Education.VYSOKE_1, certif5, true, amazon, 3);
        Data.getAllOffers().add(jobOffer2);
        JobOffer jobOffer3 = new JobOffer("Administrátor", 150.20, 0.5, Education.ZAKLADNE, certif2, "SAP", "Java", barneys, 5);
        Data.getAllOffers().add(jobOffer3); 
        JobOffer jobOffer4 = new JobOffer("Programátor", 200.20, 3.6, Education.STREDNE_S, certif3, "Python", cnn, 3);
        Data.getAllOffers().add(jobOffer4);
        JobOffer jobOffer5 = new JobOffer("Bezpečnostný konzultant", 50.20, 15.5, Education.STREDNE_BEZ, certif3, false, amazon, 10);
        Data.getAllOffers().add(jobOffer5);
        JobOffer jobOffer6 = new JobOffer("Administrátor", 10.20, 8.5, Education.VYSOKE_2, certif5, "SAP", "C#", microsoft, 3);
        Data.getAllOffers().add(jobOffer6);
        
        // Specialists
        
        // Programmers
        Specialist spec1 = new Programmer("Fero Mrkvička", "Slovenská", 150.20, 2.5, Education.STREDNE_S, certif1, "Java");
        Data.getAllSpecialists().add(spec1);
        Specialist spec4 = new  Programmer("Jano Potočný", "Slovenská", 150.20, 4.6, Education.STREDNE_S, certif4, "Python");
        Data.getAllSpecialists().add(spec4);
        Specialist spec7 = new  Programmer("Róberta Absorbiná", "Slovenská", 160.20, 5.8, Education.VYSOKE_3, certif1, "Python");
        Data.getAllSpecialists().add(spec7);
        
        // Securities
        Specialist spec2 = new Security("Jožo Poruba", "Slovenská", 170.20, 6, Education.VYSOKE_1, certif4, true);
        Data.getAllSpecialists().add(spec2);       
        Specialist spec5 = new Security("Henrieta Slaná", "Slovenská", 250.20, 15.5, Education.STREDNE_BEZ, certif4, false);
        Data.getAllSpecialists().add(spec5);
        Specialist spec8 = new Security("Neutrogena Mladá", "Česká", 100.20, 12.4, Education.VYSOKE_3, certif1, false);
        Data.getAllSpecialists().add(spec8);
        
        // Administrators
        Specialist spec6 = new Administrator("Ružena Božníkova", "Slovenská", 10.20, 8.5, Education.VYSOKE_3, certif1, "SAP", "C#");
        Data.getAllSpecialists().add(spec6);
        Specialist spec3 = new Administrator("Rajec Bylinka", "Slovenská", 150.20, 0.5, Education.ZAKLADNE, certif4, "SAP", "Java");
        Data.getAllSpecialists().add(spec3);
        Specialist spec9 = new Administrator("Schaffer Ostružinec", "Iná", 280.20, 7, Education.VYSOKE_2, certif1, "SAP", "Java");
        Data.getAllSpecialists().add(spec9);
        
        // Lease
        List<Specialist> specs1 = new ArrayList<Specialist>();
        specs1.add(spec1);
        specs1.add(spec2);
        spec1.setFree(false);
        spec2.setFree(false);

        List<Specialist> specs2 = new ArrayList<Specialist>();
        specs2.add(spec5);
        specs2.add(spec3);
        spec3.setFree(false);
        spec5.setFree(false);
        
        List<Specialist> specs3 = new ArrayList<Specialist>();
        specs3.add(spec8);
        spec8.setFree(false);
        
        Lease lease1 = new Lease(amazon, specs1);
        Lease lease2 = new Lease(barneys, specs2);
        Lease lease3 = new Lease(microsoft, specs3);
        
        Data.getAllLease().add(lease1);
        Data.getAllLease().add(lease2);
        Data.getAllLease().add(lease3);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        test();
        MainWindow main = new MainWindow();
        main.setVisible(true);
        
    }
    
}
