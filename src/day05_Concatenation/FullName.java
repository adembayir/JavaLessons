package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Adam";
        String lastName = "Ridge";
        int age = 68;
        String jobTitle = "Full-stack developer";
        String companyName = "Microsoft Corp";
        double salary = 120110.50;


        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName+" is "+age+" years old.");
        System.out.println(fullName+" is "+jobTitle+" at "+companyName+" and " +fullName+"'s salary is $"+salary+".");
    }
}
