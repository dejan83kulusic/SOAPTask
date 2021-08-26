package com.dejanblog.repo;

public class Employee{
    private int employeeId;
    private String employeeName;
    private String location;
    private int zipCode;

    public Employee(int employeeId, String employeeName, String location, int zipCode) {
        this.employeeId =
                employeeId;
        this.employeeName =
                employeeName;
        this.location =
                location;
        this.zipCode =
                zipCode;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId =
                employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName =
                employeeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location =
                location;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode =
                zipCode;
    }
}
