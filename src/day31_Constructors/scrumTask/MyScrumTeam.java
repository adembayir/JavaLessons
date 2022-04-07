package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        // 4 testers objects

        Tester tester1 = new Tester("Adem", 123, "Senior Tester",112000);
        Tester tester2 = new Tester("Yasin",124, "SDET", 108000);
        Tester tester3 = new Tester("Abdullah",125, "QA", 106000);
        Tester tester4 = new Tester("Alperen",126, "QE", 103000);

        Tester[] testers = {tester2, tester3, tester4};

        // 4 developers objects

        Developer developer1 = new Developer("Enes",127,"Java Developer", 125000);
        Developer developer2 = new Developer("Abdülmüheymin",128,"Java Master", 127000);
        Developer developer3 = new Developer("Mehmet Ercan",129,"Software Developer", 114000);
        Developer developer4 = new Developer("Ufuk",130,"Senior Developer", 119000);

        Developer[] developers = {developer2, developer3, developer4};


        // 1 ScrumTeam object

        ScrumTeam scrum = new ScrumTeam("Yunus Emre","Ibrahim Hakki", "Sina",14);

        scrum.addTester(tester1);
        scrum.addTesters(testers);

        scrum.addDeveloper(developer1);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("=======================================================================");

        for (Tester eachTester : scrum.testerList){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("=======================================================================");

        for ( Developer eachDeveloper : scrum.developerList){
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

        System.out.println("=======================================================================");

        scrum.removeTester(125);
        scrum.removeDeveloper(130);

        System.out.println(scrum);



    }
}


/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
