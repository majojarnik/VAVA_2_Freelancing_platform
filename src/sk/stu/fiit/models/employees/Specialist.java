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
public abstract class Specialist {
    double manDay;
    double experience;
    Education education;
    List<String> certificates;
    boolean free;
    String type;

    public double getManDay() {
        return manDay;
    }

    public void setManDay(double manDay) {
        this.manDay = manDay;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public abstract List<String> columnsTable();
    
    public abstract String[] rowsTable();
    
}
