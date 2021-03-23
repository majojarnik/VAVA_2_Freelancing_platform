/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employees;

import java.util.ArrayList;
import sk.stu.fiit.models.employees.Specialist;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author jarni
 */
public class Programmer extends Specialist{
    private String area;

    public Programmer(double manDay, double experience, Education education, List<String> certificates, String area) {
        this.manDay = manDay;
        this.experience = experience;
        this.education = education;
        this.certificates = certificates;
        this.area = area;
        this.free = true;
        this.type = "Programátor";        
    }
    
    public Programmer(){
        this.free = true;
        this.type = "Programátor";
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }    
    
    public String[] rowsTable(){
        return new String[] {String.valueOf(manDay), String.valueOf(experience), education.toString(), area};
    }
    
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Cena za deň");
        columns.add("Dĺžka praxe");
        columns.add("Vzdelanie");
        columns.add("Zaradenie");

        return columns;
    }
}
