package com.java.lts.features;

/**
 * Record feature
 */
record Employee (String empName, int empId, String jobLocation, String designation, String department){
}

public class OnboardEmployee{
    public static void main(String[] args){

        Employee employee = new Employee("John",1203030, "Remote", "Manager", "Sales");

        System.out.println(employee.empName()+" ( Id:"+employee.empId()+")");
    }
}