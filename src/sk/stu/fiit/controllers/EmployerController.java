/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.awt.image.BufferedImage;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.models.Employer;

/**
 *
 * @author jarni
 */
public class EmployerController {
    
    public void addEmployer(String name, String area, String numEmp, BufferedImage img) throws BlankFields{
        
        if ("".equals(name) || "".equals(area) || "".equals(numEmp) || img == null){
            throw new BlankFields();
        }
        try {
            int num = Integer.parseInt(numEmp);
            if (num < 0) {
                throw new NumberFormatException();
            }
            Employer emp = new Employer(name, area, num, img);
            Data.getAllEmployers().add(emp);
        }
        catch (NumberFormatException e){
            throw e;
        }
    }
    
}
