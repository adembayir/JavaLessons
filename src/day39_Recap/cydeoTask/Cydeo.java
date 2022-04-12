package day39_Recap.cydeoTask;

import javax.swing.text.Style;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korhan", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Asiya", 27, 'F', 3, "Soft Skill Teacher", 125000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("====================================================================");

        developer.setAge(39);

        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("====================================================================");

        developer.work();
        tester.work();
        teacher.work();
    //    student.work();

        System.out.println("====================================================================");

        developer.eat("hamburger");
        developer.drink("coke");
        developer.sleep();

        developer.fixingBugs();

        System.out.println("====================================================================");

        tester.eat("hamburger");
        tester.drink("coke");
        tester.sleep();
        
        tester.createTicket();

        System.out.println("====================================================================");

        teacher.eat("hamburger");
        teacher.drink("coke");
        teacher.sleep();

        System.out.println("====================================================================");

        student.eat("hamburger");
        student.drink("coke");
        student.sleep();

        student.study();
    }

}
