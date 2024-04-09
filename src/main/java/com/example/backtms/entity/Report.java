package com.example.backtms.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long date;
    private String note;

    @ManyToOne
    @JoinColumn(name = "patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor")
    private Doctor doctor;

    @OneToMany(mappedBy = "reports")
    private List<Measurement> measurements;

    public Report() {
    }

    public Report(long date, String note, Patient patient) {
        this.date = date;
        this.note = note;
        this.patient = patient;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
