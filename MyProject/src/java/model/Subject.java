/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Subject {
    String suid;
    String suname;
    L_Department lDept;

    public L_Department getlDept() {
        return lDept;
    }

    public void setlDept(L_Department lDept) {
        this.lDept = lDept;
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
