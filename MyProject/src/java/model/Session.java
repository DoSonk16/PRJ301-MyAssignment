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
    int sessionId;
    String sessionName;
    private ArrayList<Group> grp = new ArrayList<>();
    private ArrayList<Slot> slo = new ArrayList<>();
    private ArrayList<Room> roo = new ArrayList<>();

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public ArrayList<Group> getGrp() {
        return grp;
    }

    public void setGrp(ArrayList<Group> grp) {
        this.grp = grp;
    }

    public ArrayList<Slot> getSlo() {
        return slo;
    }

    public void setSlo(ArrayList<Slot> slo) {
        this.slo = slo;
    }

    public ArrayList<Room> getRoo() {
        return roo;
    }

    public void setRoo(ArrayList<Room> roo) {
        this.roo = roo;
    }

}
