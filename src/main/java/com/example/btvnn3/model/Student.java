package com.example.btvnn3.model;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idStudent;
    private String name;
    private String sex;
    private String address;
    private Integer subjects_count;
    @ManyToOne
    @JoinColumn(name = "idStatus")
    private Status status;

    public Student() {
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSubjects_count() {
        return subjects_count;
    }

    public void setSubjects_count(Integer subjects_count) {
        this.subjects_count = subjects_count;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
