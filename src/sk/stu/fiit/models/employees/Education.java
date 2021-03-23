/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.models.employees;

/**
 *
 * @author jarni
 */
public enum Education {

    ZAKLADNE("Základné"),
    STREDNE_BEZ("Stredoškolské bez maturity"),
    STREDNE_S("Stredoškolské s maturitou"),
    VYSSIE("Vyššie odborné"),
    VYSOKE_1("Vysokoškolské 1.stupňa"),
    VYSOKE_2("Vysokoškolské 2.stupňa"),
    VYSOKE_3("Vysokoškolské 3.stupňa");
    
    
    private final String str;

    Education(String str) {
        this.str = str;
    }

    @Override 
    public String toString() { 
        return str;
    }
    
    public static Education getEnum(String str){
        for (Education edu: Education.values()){
            if (str.equals(edu.toString())){
                return edu;
            }
        }
        //impossible
        return null;
    }
    
    
    
}
