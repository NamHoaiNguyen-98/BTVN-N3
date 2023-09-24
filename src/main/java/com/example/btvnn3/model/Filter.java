package com.example.btvnn3.model;

public class Filter {
    private String name ;
    private Long status;
    private Long subject ;
    private int sex ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getSubject() {
        return subject;
    }

    public void setSubject(Long subject) {
        this.subject = subject;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Filter(String name, Long status, Long subject, int sex) {
        this.name = name;
        this.status = status;
        this.subject = subject;
        this.sex = sex;
    }

    public Filter() {
    }
}
