package com.example.btvnn3.model;

import javax.persistence.*;

@Entity
@Table(name = "inforegiter")
public class InfoRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInfoRegister;
    @ManyToOne
    @JoinColumn(name = "idStudent")
    private Student student;
    @ManyToOne
    @JoinColumn(name="idSubject")
    private Subject subject;

    public InfoRegister() {
    }

    public Long getIdInfoRegister() {
        return idInfoRegister;
    }

    public void setIdInfoRegister(Long idInfoRegister) {
        this.idInfoRegister = idInfoRegister;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
