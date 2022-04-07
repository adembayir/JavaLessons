package week04;

public class AnazonFreeShipping {

    public static void main(String[] args) {

        double totalPrice = 10;

        if (totalPrice >= 25.0){
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: "+totalPrice+"$");
        } else {
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total is "+(25-totalPrice)+"$ less than minimum of 25$");
        }
    }
}
