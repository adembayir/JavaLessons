package week07;

import java.util.Random;

public class RandomPassword {

    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        System.out.println(source.length());

        String password = "";

        Random random = new Random(); // We created a random object so we can generate random numbers

        for (int i = 1; i <= 8 ; i++) {
            int index = random.nextInt(71);
            System.out.println("index = " + index);
            password += source.charAt(index);

        }
        System.out.println("password = " + password);


    }
}
