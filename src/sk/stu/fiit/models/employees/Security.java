/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employees;

import java.util.ArrayList;
import java.util.List;
import sk.stu.fiit.models.employees.Specialist;

/**
 *
 * @author jarni
 */
public class Security extends Specialist{
    private boolean NBU;

    
    public Security(double manDay, double experience, Education education, List<String> certificates, boolean NBU) {
        this.manDay = manDay;
        this.experience = experience;
        this.education = education;
        this.certificates = certificates;
        this.NBU = NBU;
        this.free = true;
        this.type = "Bezpečnostný konzultant";        
    }
    
    public Security(){
        this.free = true;
        this.type = "Bezpečnostný konzultant";
    }
    
    public boolean isNBU() {
        return NBU;
    }

    public void setNBU(boolean NBU) {
        this.NBU = NBU;
    }
    
    public String[] rowsTable(){
        String aud;
        if (NBU)
            aud = "áno";
        else
            aud = "nie";
        
        return new String[] {String.valueOf(manDay), String.valueOf(experience), education.toString(), aud};
    }
    
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Cena za deň");
        columns.add("Dĺžka praxe");
        columns.add("Vzdelanie");
        columns.add("Auditor NBU?");

        return columns;
    }

    
    
}
