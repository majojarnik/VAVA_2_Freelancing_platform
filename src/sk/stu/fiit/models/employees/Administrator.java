/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employees;

import java.util.ArrayList;
import java.util.List;
import sk.stu.fiit.models.JobOffer;

/**
 *
 * @author jarni
 */
public class Administrator extends Specialist{
    private String area;
    private String platform;
    
    public Administrator(String name, String nationality, double manDay, double experience, Education education, List<String> certificates, String area, String platform) {
        this.name = name;
        this.nationality = nationality;
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
    
    @Override
    public String[] rowsTable(){
        return new String[] {String.valueOf(manDay), String.valueOf(experience), education.toString(), area, platform};
    }
    
    @Override
    public List<String> columnsTable(){
        List<String> columns = new ArrayList<String>();
        
        columns.add("Cena za deň");
        columns.add("Dĺžka praxe");
        columns.add("Vzdelanie");
        columns.add("Zaradenie");
        columns.add("Platforma");

        return columns;
    }

    @Override
    public boolean goodForPosition(JobOffer offer){
        boolean good = false;
        if (free && manDay <= offer.getManDay() && 
                experience >= offer.getExperience() && 
                education.compareTo(offer.getEducation()) >= 0 &&
                area.equals(offer.getArea()) && 
                platform.equals(offer.getPlatform()) &&
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
