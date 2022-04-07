package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc.";


        ProductOwner PO = new ProductOwner("Mehmet Sefa", 38, 'M', 101, 172000, "Amazon Inc.");

        ScrumMaster SM = new ScrumMaster("Cemal Resit Rey", 33, 'M', 102, 168000, "Amazon Inc.");

        BusinessAnalyst BA = new BusinessAnalyst("Zuhal Olcay", 42, 'F', 103, 152000, "Amazon Inc." );



        Tester tester1 = new Tester("Chinara",32,'F',104,"QA",125000,company);

        Tester tester2 = new Tester("Yasaman",31,'F', 105,"QE",130000,company);

        Tester tester3 = new Tester("Irena",29,'F', 106,"SDET",128000,company);

        Tester tester4 = new Tester("Cihad",26,'M',107,"QA",125000,company);

        Tester[] testers = {tester1, tester2, tester3, tester4};






        Developer developer1=new Developer("Max", 40, 'M', 108, "Senior Java Developer", 180000, company);

        Developer developer2=new Developer("Allison", 18, 'F', 109, "Junior Java Developer", 120000, company);

        Developer developer3=new Developer("Tom", 26, 'M', 110, "Java Developer", 140000, company);

        Developer developer4=new Developer("Manas", 40, 'M', 111, "Full Stack Developer", 280000, company);

        Developer developer5=new Developer("Evelyn", 30, 'F', 112, "JS Developer", 160000, company);

        Developer[] developers = {developer1, developer2, developer3, developer4, developer5};



        ScrumTeam ST = new ScrumTeam(PO,BA,SM);

        ST.addDevelopers(developers);
        ST.addTesters(testers);

        System.out.println(ST);

        System.out.println("=====================================================================");

        for (Tester eachTester : ST.testers) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }


    }
}
/*
9. Create a class named AmazonInc:

			create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
			Create 4 objects of Testers
			Create 5 Objects of Developers

			Create an object of ScrumTeam

			Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team
 */