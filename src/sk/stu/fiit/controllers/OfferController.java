/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.util.List;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.models.Employer;
import sk.stu.fiit.models.JobOffer;
import sk.stu.fiit.models.employees.Administrator;
import sk.stu.fiit.models.employees.Education;
import sk.stu.fiit.models.employees.Programmer;
import sk.stu.fiit.models.employees.Security;

/**
 *
 * @author jarni
 */
public class OfferController {
  
    public void addProgrammer(String numEmp, int employer, String manDay, String experience, String education, String area, List<String> certificates) throws BlankFields{
        if ("".equals(numEmp) || "".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area)){
            throw new BlankFields();
        }
        try {
            int numSpec = Integer.parseInt(numEmp);
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            JobOffer jobOffer = new JobOffer("Programátor", manday, exp, edu, certificates, area, Data.getAllEmployers().get(employer), numSpec);
            Data.getAllOffers().add(jobOffer);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
    
        
    public void addSecurity(String numEmp, int employer, String manDay, String experience, String education, boolean nbu, List<String> certificates) throws BlankFields{
        
        if ("".equals(numEmp) || "".equals(manDay) || "".equals(experience) || "".equals(education)){
            throw new BlankFields();
        }
        try {
            int numSpec = Integer.parseInt(numEmp);
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            JobOffer jobOffer = new JobOffer("Bezpečnostný konzultant", manday, exp, edu, certificates, nbu, Data.getAllEmployers().get(employer), numSpec);
            Data.getAllOffers().add(jobOffer);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
        
    public void addAdministrator(String numEmp, int employer, String manDay, String experience, String education, String area, List<String> certificates, String platform) throws BlankFields{
        
        if ("".equals(numEmp) || "".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area) || "".equals(platform)){
            throw new BlankFields();
        }
        try {
            int numSpec = Integer.parseInt(numEmp);
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            JobOffer jobOffer = new JobOffer("Administrátor", manday, exp, edu, certificates, area, platform, Data.getAllEmployers().get(employer), numSpec);
            Data.getAllOffers().add(jobOffer);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
    
    public void removeOffer(int offer) throws BlankFields {
        if (offer < 0){
            throw new BlankFields();
        }
        
        Data.getAllOffers().remove(offer);
    }

    
}
