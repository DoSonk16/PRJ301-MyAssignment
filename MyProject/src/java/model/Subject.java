/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Subject {
    String suid;
    String suname;
    private ArrayList<L_Department> ldept = new ArrayList<>();

    public ArrayList<L_Department> getLdept() {
        return ldept;
    }

    public void setLdept(ArrayList<L_Department> lDept) {
        this.ldept = lDept;
    }
    
    public String getSuid() {
        return suid;
    }

    public void setSuid(String suid) {
        this.suid = suid;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }
    
}
