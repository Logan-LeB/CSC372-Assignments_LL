package com.student.management;

public class Student {
    private int rollnum;
    private String name;
    private String address;
    
    // Constructor
    public Student(int rollnum, String name, String address) {
        this.rollnum = rollnum;
        this.name = name;
        this.address = address;
    }
    
    // Getters
    public int getRollnum() {
        return rollnum;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    // Setters
    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // toString method for easy printing
    @Override
    public String toString() {
        return "Student [rollnum=" + rollnum + ", name=" + name + ", address=" + address + "]";
    }
}