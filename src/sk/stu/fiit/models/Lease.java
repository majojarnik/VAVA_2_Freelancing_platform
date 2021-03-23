/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models;

import sk.stu.fiit.models.employees.Specialist;
import java.util.List;

/**
 *
 * @author jarni
 */
public class Lease {
    private Employer employer;
    private List<Specialist> specialists;

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Specialist> getSpecialists() {
        return specialists;
    }

    public void setSpecialists(List<Specialist> specialists) {
        this.specialists = specialists;
    }

    public Lease(Employer employer, List<Specialist> specialists) {
        this.employer = employer;
        this.specialists = specialists;
    }
    
    
}
