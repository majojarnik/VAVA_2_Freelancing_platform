/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models;

import java.util.List;
import sk.stu.fiit.models.employees.Education;

/**
 *
 * @author jarni
 */
public class JobOffer {
    private double manDay = 0;
    private double experience = 0;
    private Education education = null;
    private List<String> certificates = null;
    private boolean free = true;
    private String type = "";
    
    private String area = "";
    private String platform = "";
    private boolean NBU = false;
    
    private int numEmp;
    
    private Employer employer;

    public JobOffer(String type, double manDay, double experience, Education education, List<String> certificates, String area, String platform, Employer employer, int numEmp) {
        this.manDay = manDay;
        this.experience = experience;
        this.education = education;
        this.certificates = certificates;
        this.type = type;
        this.area = area;
        this.platform = platform;
        this.employer = employer;
        this.numEmp = numEmp;
    }

    public JobOffer(String type, double manDay, double experience, Education education, List<String> certificates, String area, Employer employer, int numEmp) {
        this.manDay = manDay;
        this.experience = experience;
        this.education = education;
        this.certificates = certificates;
        this.type = type;
        this.area = area;
        this.employer = employer;
        this.numEmp = numEmp;

    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
    
    public JobOffer(String type, double manDay, double experience, Education education, List<String> certificates, boolean NBU, Employer employer, int numEmp) {
        this.manDay = manDay;
        this.experience = experience;
        this.education = education;
        this.certificates = certificates;
        this.type = type;
        this.NBU = NBU;
        this.employer = employer;
        this.numEmp = numEmp;
    }

    

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

    public boolean isNBU() {
        return NBU;
    }

    public void setNBU(boolean NBU) {
        this.NBU = NBU;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    
    
    
    
}
