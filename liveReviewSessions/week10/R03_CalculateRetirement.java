package week10;

public class R03_CalculateRetirement {

    public static void main(String[] args) {

        yearsUntilRetirement("Adem", 1988);

    }

    public static int age(int birthYear){
        int age= 2022 - birthYear;

        return age;
    }

    public static void yearsUntilRetirement(String name, int yearOfBirth){
        int yearsUntilRetirement = 65 - age(yearOfBirth);
        System.out.println(name+" retires in "+ yearsUntilRetirement + " years");
    }


}
