package utilities;

import static day34_GarbageCollection_AccessModifiers.AccessModifiers.*;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(publicData);
  //    System.out.println(defaultData); // default AM is not reachable outside of package
  //    System.out.println(privateData); // private AM is not reachable outside of class


        method1();
  //    method2(); ---> default AM is not reachable outside of package
  //    method3(); ---> private AM is not reachable outside of class

    }
}
