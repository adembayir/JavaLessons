package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Halid Kalkan",
                buildingNumber = "8145B",
                streetName = "Mustafa Kemal Blvd.",
                city = "San Jose",
                state = "CA",
                zipCode = "24588";

        // System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+"\n"+zipCode);

        String address = name+"\n"+buildingNumber+" "+streetName+"\n"+city+", "+state+"\n"+zipCode;

        System.out.println(address);


    }
}
