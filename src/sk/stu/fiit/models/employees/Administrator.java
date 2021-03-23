/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Administrator extends Specialist{
    private String area;
    private String platform;
    
    public Administrator(double manDay, double experience, Education education, List<String> certificates, String area, String platform) {
        this.manDay = manDay;
        this.experience = experience;
        this.education = education;
        this.certificates = certificates;
        this.area = area;
        this.platform = platform;
        this.free = true;
        this.type = "Administrátor";        
    }
    
    public Administrator(){
        this.free = true;
        this.type = "Administrátor";
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public String[] rowsTable(){
        return new String[] {String.valueOf(manDay), String.valueOf(experience), education.toString(), area, platform};
    }
    
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Cena za deň");
        columns.add("Dĺžka praxe");
        columns.add("Vzdelanie");
        columns.add("Zaradenie");
        columns.add("Platforma");

        return columns;
    }
    
    
}
