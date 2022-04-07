package week08;

public class ArrayLoopWithConditions {

    public static void main(String[] args) {


    // amazon website search results for a product
    double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        for (double eachPrice : prices) {
            System.out.println("eachPrice = " + eachPrice);

        }

        System.out.println("---------------------------------------------------------------------");

        //print all numbers from prices array that are more than 100

        for (double price : prices) {
            if (price > 100.0){
                System.out.println("price = " + price);
            }
        }

        System.out.println("---------------------------------------------------------------------");

        int count = 0;
        for (double price : prices) {

            if(price > 50){
                count++;
            }

        }
        System.out.println(count);







    }
}
