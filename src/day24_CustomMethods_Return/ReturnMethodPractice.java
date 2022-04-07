package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int maxNumber = maxNumber(100,200);

        System.out.println(maxNumber);

        int multiplication = maxNumber*2;

        System.out.println("multiplication = " + multiplication);



    }

    public static int maxNumber(int num1, int num2){

        int result = 0;

        if (num1 > num2){
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }

}
