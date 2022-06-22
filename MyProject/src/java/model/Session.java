/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Session {
    String sid;
    int lid;
    String suid;
    Date sldate;
    String rname;
    private ArrayList<Student> stu = new ArrayList<>();
    private ArrayList<Lecturer> lec = new ArrayList<>();
    private ArrayList<Room> roo = new ArrayList<>();
    private ArrayList<Subject> sub = new ArrayList<>();
    private ArrayList<Slot> slo = new ArrayList<>();

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getSuid() {
        return suid;
    }

    public void setSuid(String suid) {
        this.suid = suid;
    }

    public Date getSldate() {
        return sldate;
    }

    public void setSldate(Date sldate) {
        this.sldate = sldate;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public ArrayList<Student> getStu() {
        return stu;
    }

    public void setStu(ArrayList<Student> stu) {
        this.stu = stu;
    }

    public ArrayList<Lecturer> getLec() {
        return lec;
    }

    public void setLec(ArrayList<Lecturer> lec) {
        this.lec = lec;
    }

    public ArrayList<Room> getRoo() {
        return roo;
    }

    public void setRoo(ArrayList<Room> roo) {
        this.roo = roo;
    }

    public ArrayList<Subject> getSub() {
        return sub;
    }

    public void setSub(ArrayList<Subject> sub) {
        this.sub = sub;
    }

    public ArrayList<Slot> getSlo() {
        return slo;
    }

    public void setSlo(ArrayList<Slot> slo) {
        this.slo = slo;
    }
    
}
