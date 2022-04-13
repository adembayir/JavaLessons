package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.AccessModifiers.*;

public abstract class AccessModifiers_Test1 {

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
    //  System.out.println(privateData); // private is not visible outside of the class


    method1();
    method2();
//  method3(); ---> private is not visible outside of class

    }


}
