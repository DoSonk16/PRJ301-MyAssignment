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
public class Contract {
    private ArrayList<Lecturer> lec = new ArrayList<>();
    private ArrayList<L_Department> ldept = new ArrayList<>();

    public ArrayList<Lecturer> getLec() {
        return lec;
    }

    public void setLec(ArrayList<Lecturer> lec) {
        this.lec = lec;
    }

    public ArrayList<L_Department> getLdept() {
        return ldept;
    }

    public void setLdept(ArrayList<L_Department> ldept) {
        this.ldept = ldept;
    }
    
}
