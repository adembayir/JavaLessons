package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("Galaxy Note 20 Ultra", "7.3 inches", 1100, "Swan White" );

        Nokia nokia = new Nokia("3310", "4 inches", 50, "Dark Blue");

        System.out.println(iphone);

        System.out.println(samsung);

        System.out.println(nokia);

        iphone.call(5422294742l);
        iphone.text(123456789);
        iphone.faceTime("adembyr@hotmail.com");


        System.out.println("==================================================================");

        samsung.call(4567985);
        samsung.text(45684545);
        samsung.freeze();

        System.out.println("==================================================================");

        nokia.selfDefence();
        nokia.call(45454545);

        System.out.println("==================================================================");

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
        System.out.println(Phone.hasBattery);


    }

}