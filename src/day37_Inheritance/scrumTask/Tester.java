package day37_Inheritance.scrumTask;

public class Tester extends Employee { // tester is a employee (IS A relationship)

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }
}
/*
3. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */
