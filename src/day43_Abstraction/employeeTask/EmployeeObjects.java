package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 172000);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 110000);
        Driver driver = new Driver("Barbaros", 40, 'M', 54, "Super Truck Driver", 120000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("============================================================");

        developer.work();
        developer.sleep();
    //  developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("============================================================");

        teacher.work();
        teacher.sleep();
    //  teacher.bugReport();
        teacher.eat();
    //  teacher.unitTest();









    }

}
