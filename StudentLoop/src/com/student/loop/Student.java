package com.student.loop;

public class Student {
    private String name;
    private String address;
    private Double gpa;

    // Constructor
    public Student(String name, String address, Double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Double getGPA() {
        return gpa;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGPA(Double gpa) {
        this.gpa = gpa;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + ", gpa=" + gpa + "]";
    }
}