package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, "Business Analyst", salary, companyName);
    }

    public void analyze() {
        System.out.println(jobTitle + " " + name + " analyzes documents");
    }
}
/*
5. Create a sub class of EMployee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have
 */