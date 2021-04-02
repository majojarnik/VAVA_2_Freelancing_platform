/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models;

import java.awt.image.BufferedImage;

/**
 *
 * @author jarni
 */
public class Employer {
    private String name;
    private String area;
    private int numEmployees;
    private BufferedImage logo;
    
    public Employer(String name, String area, int numEmployees, BufferedImage logo) {
        this.name = name;
        this.area = area;
        this.numEmployees = numEmployees;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public BufferedImage getLogo() {
        return logo;
    }

    public void setLogo(BufferedImage logo) {
        this.logo = logo;
    }
    
    
}
