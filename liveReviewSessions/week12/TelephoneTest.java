package week12;

public class TelephoneTest {

    public static void main(String[] args) {

        //   System.out.println(Telephone.total); // static block initialize

        Telephone telephone1 = new Telephone();  // do I get my static block initialized? YES

        System.out.println(telephone1.total);
        telephone1.setNumber("555-5055050");
        System.out.println(telephone1.getNumber());

    }
}
