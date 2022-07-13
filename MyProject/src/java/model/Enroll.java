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
public class Enroll {
    private ArrayList<Student> stu = new ArrayList<>();
    private ArrayList<Group> grp = new ArrayList<>();

    public ArrayList<Student> getStu() {
        return stu;
    }

    public void setStu(ArrayList<Student> stu) {
        this.stu = stu;
    }

    public ArrayList<Group> getGrp() {
        return grp;
    }

    public void setGrp(ArrayList<Group> grp) {
        this.grp = grp;
    }
    
}
