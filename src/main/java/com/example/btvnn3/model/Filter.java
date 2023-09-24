package com.example.btvnn3.model;

public class Filter {
    private String name ;
    private String status;
    private String subject ;
    private String sex ;

    public Filter(String name, String status, String subject, String sex) {
        this.name = name;
        this.status = status;
        this.subject = subject;
        this.sex = sex;
    }

    public Filter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
