/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.data;

import java.util.ArrayList;
import java.util.List;
import sk.stu.fiit.models.Employer;
import sk.stu.fiit.models.JobOffer;
import sk.stu.fiit.models.Lease;
import sk.stu.fiit.models.employees.Specialist;

/**
 *
 * @author jarni
 */
public class Data {
    private static List<Specialist> allSpecialists = new ArrayList<>();
    private static List<Employer> allEmployers = new ArrayList<>();
    private static List<Lease> allLease = new ArrayList<>();
    private static List<JobOffer> allOffers = new ArrayList<>();

    public static List<Specialist> getAllSpecialists() {
        return allSpecialists;
    }

    public static void setAllSpecialists(List<Specialist> aAllSpecialists) {
        allSpecialists = aAllSpecialists;
    }

    public static List<Employer> getAllEmployers() {
        return allEmployers;
    }

    public static void setAllEmployers(List<Employer> aAllEmployers) {
        allEmployers = aAllEmployers;
    }

    public static List<Lease> getAllLease() {
        return allLease;
    }

    public static void setAllLease(List<Lease> aAllLease) {
        allLease = aAllLease;
    }

    public static List<JobOffer> getAllOffers() {
        return allOffers;
    }

    public static void setAllOffers(List<JobOffer> allOffers) {
        Data.allOffers = allOffers;
    }
    
    
    
    
}
