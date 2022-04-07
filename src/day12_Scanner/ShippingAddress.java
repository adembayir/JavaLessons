package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = scan.next();
        scan.nextLine();

        System.out.println("Enter your street name: ");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state: ");
        String state = scan.next();

        System.out.println("Enter your ZIP Code: ");
        String zipCode = scan.next();
        scan.close();

        String address = fullName+"\n"+street+" "+buildingNumber+"\n"+cityName+", "+state+" "+zipCode;

        System.out.println("address = " + address);


    }
}
/*
1. enter your full name ( nextLine() )
2. enter your building number ( next() )
3. enter your street name ( nextLine() )
4. enter your city name ( nextLine() )
5. enter your state ( next() )
6. enter your zip code ( next() )

Display the shipping address.

 */