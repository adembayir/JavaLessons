package day24_CustomMethods_Return;

public class WarmUpTasks {

    public static void main(String[] args) {

        initials("neriman eda bayır");

        domain("adem.byr@hotmail.com");

        months(8);

        days(3);

        dayCount(6);

        System.out.println(camelCase("aDeM"));


    }
    // 1. 1. Create a method that can display the initials of the person

    public static void initials(String fullName){
        String firstName = fullName.substring(0,fullName.indexOf(" ")).toUpperCase();
        String lastName = fullName.substring(fullName.lastIndexOf(" ")+1).toUpperCase();
        String initials = firstName.charAt(0)+"."+lastName.charAt(0);

        System.out.println(initials);
    }

    // 1. 2. Create a method that can display the domain of the email

    public static void domain(String eMail){
        String domain = eMail.substring(eMail.indexOf("@")+1, eMail.lastIndexOf("."));
        System.out.println(domain);
    }

    // 1. 3. Create a method that can display the name of the month based on the given number to the method

    public static void months(int number){
        if (number >= 1 && number <= 12) {
            String month = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September"
                    : (number == 10) ? "October" : (number == 11) ? "November" : "December";

            System.out.println(month);
        } else {
            System.out.println("Invalid entry.");
        }
    }

    // 1. 4. Create a method that can print the name of the day based on the given number to the method

    public static void days(int number){
        if ( number <1 || number > 7){
            System.out.println("Invalid entry!");
        } else {
            String day = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wednesday" :(number == 4)?
            "Thursday" :(number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday";

            System.out.println(day);
        }
    }

    // 1. 5. Create a method that can print how many days a month has

    public static void dayCount(int number){
        if (number >= 1 && number <= 12) {
            if (number == 2) {
                System.out.println("The month has 28 days");
            } else if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
                System.out.println("The month has 31 days");
            } else {
                System.out.println("The month has 30 days");
            }
        } else {
            System.out.println("Invalid number");
        }
    }

    public static String camelCase(String text){
        text=text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase();
        return text;
    }




}

