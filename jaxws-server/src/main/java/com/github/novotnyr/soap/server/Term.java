package com.github.novotnyr.soap.server;

import java.time.LocalDate;

public class Term {

    private String courseCode;

    private LocalDate date;

    private int freeSlots;

    public Term(LocalDate date, String courseCode, int freeSlots) {
        this.date = date;
        this.courseCode = courseCode;
        this.freeSlots = freeSlots;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getFreeSlots() {
        return this.freeSlots;
    }

    public void setFreeSlots(int freeSlots) {
        this.freeSlots = freeSlots;
    }
}