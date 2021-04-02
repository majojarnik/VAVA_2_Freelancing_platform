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
import sk.stu.fiit.models.JobOffer;

/**
 *
 * @author jarni
 */
public class Programmer extends Specialist{
    private String area;

    public Programmer(String name, String nationality, double manDay, double experience, Education education, List<String> certificates, String area) {
        this.name = name;
        this.nationality = nationality;
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
    
    @Override
    public String[] rowsTable(){
        return new String[] {name, String.valueOf(manDay), String.valueOf(experience), education.toString(), area};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Meno");
        columns.add("Cena za deň");
        columns.add("Dĺžka praxe");
        columns.add("Vzdelanie");
        columns.add("Zaradenie");

        return columns;
    }
    
    @Override
    public boolean goodForPosition(JobOffer offer){
        boolean good = false;
        if (free && manDay <= offer.getManDay() && 
                experience >= offer.getExperience() && 
                education.compareTo(offer.getEducation()) >= 0 &&
                area.equals(offer.getArea()) &&
                type.equals(offer.getType()))
        {
            good = true;
            for (String certificate : offer.getCertificates()) {
                if (!certificates.contains(certificate)){
                    good = false;
                    break;
                }
            }     
        }
        return good;
    }
}
