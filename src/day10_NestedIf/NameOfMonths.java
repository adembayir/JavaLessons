package day10_NestedIf;

public class NameOfMonths {

    public static void main(String[] args) {

        int numberOfMonth = 5;
        String nameOfMonth = null ;


        /* if (numberOfMonth == 1) {
            nameOfMonth = "January";
        } else if (numberOfMonth == 2) {
            nameOfMonth = "February";
        } else if (numberOfMonth == 3) {
            nameOfMonth = "March";
        } else if (numberOfMonth == 4) {
            nameOfMonth = "April";
        } else if (numberOfMonth == 5) {
            nameOfMonth = "May";
        } else if (numberOfMonth == 6) {
            nameOfMonth = "June";
        } else if (numberOfMonth == 7) {
            nameOfMonth = "July";
        } else if (numberOfMonth == 8) {
            nameOfMonth = "August";
        } else if (numberOfMonth == 9) {
            nameOfMonth = "September";
        } else if (numberOfMonth == 10) {
            nameOfMonth = "October";
        } else if (numberOfMonth == 11) {
            nameOfMonth = "November";
        } else {
            nameOfMonth = "December";
        }
         */

        nameOfMonth =   numberOfMonth == 1? "January" :numberOfMonth == 2? "February" :numberOfMonth == 3? "February" :numberOfMonth == 4? "April"
                        :numberOfMonth == 5? "May" :numberOfMonth == 6? "June" :numberOfMonth == 7? "July" :numberOfMonth == 8? "August"
                        :numberOfMonth == 9? "September" :numberOfMonth == 10? "October" :numberOfMonth == 11? "November" : "December" ;

        System.out.println(nameOfMonth);



    }
}
