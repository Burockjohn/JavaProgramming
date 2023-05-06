package utilites;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test2 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        // System.out.println(ProtectedAccessModifier.name1); // default is not visible outside the package
        System.out.println(ProtectedAccessModifier.name2); // protected is visible outside the package in subclass only

        // AccessModifiers_Test2.method1(); compile error
        AccessModifiers_Test2.method2();

    }
}
