/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Req {
    private String reason;
    private Date from;
    private Date to;
    private Emp create_by;
    private Emp review_by;
    private Status status;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Emp getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Emp create_by) {
        this.create_by = create_by;
    }

    public Emp getReview_by() {
        return review_by;
    }

    public void setReview_by(Emp review_by) {
        this.review_by = review_by;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
}
