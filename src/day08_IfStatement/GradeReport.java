package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        String studentName = "Frida";
        int score = 95;

        boolean a = score>=90 && score<=100;
        boolean b = score>=80 && score<=89; // boolean b = score>=80 && !a; if score is not A, but grater than or equal to 80
        boolean c = score>=70 && score<=79; // boolean c = score>=70 && !a && !b: if score is not A nor B but grater than or equal to 70
        boolean d = score>=60 && score<=69;
        boolean f = score>=0  && score<=59; // boolean f = !a && !b && !c && !d

        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("Great");
        }
        if (c){
            System.out.println("Good");
        }
        if (d){
            System.out.println("Passed");
        }
        if (f){
            System.out.println("Failed");
        }
    }
}
/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89  ==> Great
    70 ~ 79  ==> Good
    60 ~ 69  ==> Passed
     0 ~ 59  ==> Failed
 */