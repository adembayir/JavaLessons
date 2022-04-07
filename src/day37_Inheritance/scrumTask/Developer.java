package day37_Inheritance.scrumTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    public void fixBugs() {
        System.out.println(jobTitle + " " + name + " is fixing bugs");
    }

}
/*
4. Create a sub class of EMployee named Developer:

			Add any extra variable or method that Developer object need to have
 */