package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); //int

        System.out.println(num+1); //124

        System.out.println(str+1); //1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 5.7);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);

        String str3 = "maybeeee";

        boolean b1 = Boolean.parseBoolean(str3);

        System.out.println(b1);

        System.out.println("====================================================================");

        String str4 = "123";

        Integer x = Integer.valueOf(str4);

        int y = Integer.valueOf(str4);

        System.out.println(x);

        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);

        System.out.println(z);

        System.out.println("====================================================================");

        // isDigit()

        char ch1 = '!';

        boolean r2 = Character.isDigit(ch1);

        System.out.println(r2);

        // isLetter()

        boolean r3 = Character.isLetter(ch1);

        System.out.println(r3);

        // isLetterOrDigit()

        boolean r4 = !Character.isLetterOrDigit(ch1);

        System.out.println(r4);

        //isUpperCase()

        char ch2 = 'A';

        boolean r5 = Character.isUpperCase(ch2);

        System.out.println(r5);

        //isLowerCase()

        char ch3 = 's';

        boolean r6 = Character.isLowerCase(ch3);

        System.out.println(r6);

        System.out.println("====================================================================");

        String s = "ab1cde3efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if ( Character.isDigit(each)) {
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println("sum = " + sum);





    }
}
