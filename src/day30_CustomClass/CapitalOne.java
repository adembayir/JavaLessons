package day30_CustomClass;

import java.util.ArrayList;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Bugs Bunny",0001, 'F', "Chief of Carrot Operations", 200000.0, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Duffy Duck",0002, 'M', "Migrating Birds Leader", 110000.0, false);

        Employee employee3 = new Employee();
        employee3.setInfo("Tasmanian Devil",0003, 'M', "Anger Management Specialist", 175000.0, true);

        Employee employee4 = new Employee();
        employee4.setInfo("Kim Possible",0004, 'F', "Special Operations Chairwoman", 251000.0, true);

        Employee employee5 = new Employee();
        employee5.setInfo("Tom the Cat",0005, 'M', "Nugae Specialist", 90000.0, false);

        Employee[] employeeList = {employee1, employee2, employee3, employee4, employee5};

        ArrayList<Employee> fullTime = new ArrayList<>();

        for (Employee eachEmployee : employeeList) {
            if (eachEmployee.isFullTime){
                fullTime.add(eachEmployee);
            }
        }
        System.out.println("fullTime = " + fullTime);

        double minSalary = Double.MAX_VALUE;
        for (Employee eachEmployee : employeeList) {
            if(eachEmployee.salary < minSalary){
                minSalary = eachEmployee.salary;
            }
        }
        System.out.println("minSalary = " + minSalary);

        double maxSalary = Double.MIN_VALUE;
        for (Employee eachEmployee : employeeList) {
            if(eachEmployee.salary > maxSalary){
                maxSalary = eachEmployee.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);


    }
}
