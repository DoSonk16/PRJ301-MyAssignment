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
public class Learn {
    private ArrayList<Student> stu = new ArrayList<>();
    private ArrayList<Department> dept = new ArrayList<>();

    public ArrayList<Student> getStu() {
        return stu;
    }

    public void setStu(ArrayList<Student> stu) {
        this.stu = stu;
    }

    public ArrayList<Department> getDept() {
        return dept;
    }

    public void setDept(ArrayList<Department> dept) {
        this.dept = dept;
    }
    
}
