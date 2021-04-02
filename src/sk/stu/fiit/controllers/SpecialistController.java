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
    
    
    public void addProgrammer(String name, String nationality, String manDay, String experience, String education, String area, List<String> certificates) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            Programmer prog = new Programmer(name, nationality, manday, exp, edu, certificates, area);
            Data.getAllSpecialists().add(prog);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
    
     public void editProgrammer(Programmer prog,String name, String nationality, String manDay, String experience, String education, String area, List<String> certificates) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            prog.setArea(area);
            prog.setCertificates(certificates);
            prog.setEducation(edu);
            prog.setExperience(exp);
            prog.setManDay(manday);
            prog.setName(name);
            prog.setNationality(nationality);
           
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
        
    public void addSecurity(String name, String nationality, String manDay, String experience, String education, boolean nbu, List<String> certificates) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);

            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            Security security = new Security(name, nationality, manday, exp, edu, certificates, nbu);
            Data.getAllSpecialists().add(security);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
    
    public void editSecurity(Security sec, String name, String nationality, String manDay, String experience, String education, boolean nbu, List<String> certificates) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);

            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            
            sec.setCertificates(certificates);
            sec.setEducation(edu);
            sec.setExperience(exp);
            sec.setManDay(manday);
            sec.setNBU(nbu);
            sec.setName(name);
            sec.setNationality(nationality);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
        
    public void addAdministrator(String name, String nationality, String manDay, String experience, String education, String area, List<String> certificates, String platform) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area) || "".equals(platform)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            Administrator administrator = new Administrator(name, nationality, manday, exp, edu, certificates, area, platform);
            Data.getAllSpecialists().add(administrator);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
    
    public void editAdministrator(Administrator admin, String name, String nationality, String manDay, String experience, String education, String area, List<String> certificates, String platform) throws BlankFields{
        
        if ("".equals(manDay) || "".equals(experience) || "".equals(education) || "".equals(area) || "".equals(platform)){
            throw new BlankFields();
        }
        try {
            double manday = Double.parseDouble(manDay);
            double exp = Double.parseDouble(experience);
            Education edu = Education.getEnum(education);
            
            if (manday < 0 || exp < 0) {
                throw new NumberFormatException();
            }
            admin.setArea(area);
            admin.setCertificates(certificates);
            admin.setEducation(edu);
            admin.setExperience(exp);
            admin.setManDay(manday);
            admin.setName(name);
            admin.setNationality(nationality);
            admin.setPlatform(platform);
            
        }
        catch (NumberFormatException e){
            throw e;
        }
    }

}
