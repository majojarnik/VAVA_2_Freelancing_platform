/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.util.Arrays;
import java.util.List;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.models.employees.Administrator;
import sk.stu.fiit.models.employees.Education;
import sk.stu.fiit.models.employees.Programmer;
import sk.stu.fiit.models.employees.Security;

/**
 *
 * @author jarni
 */
public class SpecialistController {
    
    
    public void addProgrammer(String manDay, String experience, String education, String area, String certificates) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            String[] certs = certificates.split("\n");
            List<String> crt = Arrays.asList(certs);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            Programmer prog = new Programmer(manday, exp, edu, crt, area);
            Data.getAllSpecialists().add(prog);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
        
    public void addSecurity(String manDay, String experience, String education, boolean nbu, String certificates) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            String[] certs = certificates.split("\n");
            List<String> crt = Arrays.asList(certs);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            Security security = new Security(manday, exp, edu, crt, nbu);
            Data.getAllSpecialists().add(security);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
        
    public void addAdministrator(String manDay, String experience, String education, String area, String certificates, String platform) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area) || "".equals(platform)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            String[] certs = certificates.split("\n");
            List<String> crt = Arrays.asList(certs);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            Administrator administrator = new Administrator(manday, exp, edu, crt, area, platform);
            Data.getAllSpecialists().add(administrator);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }

}
