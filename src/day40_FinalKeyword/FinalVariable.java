package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name = "Batch EU-8";

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14; // unchangeable

        // pi = 4.14; final variables can not be reassigned
        // pi = 5.4;

        final String name;

        name = "Java";

//      name = "Wooden Spoon";

        System.out.println(name);

        System.out.println("=====================================================");

        FinalVariable obj = new FinalVariable("May/01");
//      obj.birthDay = "June/14"; // final variables can not be reassigned
        System.out.println(obj.birthDay);

        System.out.println("=====================================================");

        System.out.println(FinalVariable.name);
    }
}
