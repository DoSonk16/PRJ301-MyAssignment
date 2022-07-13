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
public class Group {
    int gid;
    String gname;
    private ArrayList<Subject> sub = new ArrayList<>();
    private ArrayList<Lecturer> lec = new ArrayList<>();

    public ArrayList<Subject> getSub() {
        return sub;
    }

    public void setSub(ArrayList<Subject> sub) {
        this.sub = sub;
    }

    public ArrayList<Lecturer> getLec() {
        return lec;
    }

    public void setLec(ArrayList<Lecturer> lec) {
        this.lec = lec;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }
}
