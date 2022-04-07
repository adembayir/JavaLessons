package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourlyRate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int workWeeks = 52;

        int salary = hourlyRate * weeklyHours * workWeeks;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("workingWeeks = " + workWeeks);
        System.out.println("salary = $" + salary);


    }
}
