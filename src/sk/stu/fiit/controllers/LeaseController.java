/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.controllers;

import java.util.ArrayList;
import java.util.List;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.models.Employer;
import sk.stu.fiit.models.Lease;
import sk.stu.fiit.models.employees.Specialist;

/**
 *
 * @author jarni
 */
public class LeaseController {
    
    private List<Specialist> getListSpecialists(String type){
        List<Specialist> list = new ArrayList<Specialist>();
        
        for (Specialist spec: Data.getAllSpecialists()){
            if (Boolean.logicalAnd(Boolean.logicalOr(type.equals(spec.getType()), type.equals("Všetky kategórie")), spec.isFree())){
                list.add(spec);
            }
        }
        
        return list;
    }
    
    public void addLease(int empl, int[] specs, String type) throws BlankFields{      
        if (Boolean.logicalOr(empl < 0, specs.length == 0)){
            throw new BlankFields();
        }
              
        Employer emp = Data.getAllEmployers().get(empl);
       
        List<Specialist> specialists = getListSpecialists(type);
        
        List<Specialist> selected = new ArrayList<>();
        
        for (Integer i: specs){
            specialists.get(i).setFree(false);
            selected.add(specialists.get(i));
        }
        
        Lease lease = new Lease(emp, selected);
        
        Data.getAllLease().add(lease);
        
    }
    
    public void addLease(Employer empl, List<Specialist> specs){
        for (Specialist spec: specs){
            spec.setFree(false);
        }
        
        Lease lease = new Lease(empl, specs);
        
        Data.getAllLease().add(lease);
        
    }

    public void removeLease(int lease) throws BlankFields {
        if (lease < 0){
            throw new BlankFields();
        }
        
        for (Specialist spec: Data.getAllLease().get(lease).getSpecialists()){
            spec.setFree(true);
        }
        
        Data.getAllLease().remove(lease);
    }
    
}
