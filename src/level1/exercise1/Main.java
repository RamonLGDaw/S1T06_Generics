package level1.exercise1;

import level1.exercise1.Model.NoGenericMethods;

public class Main {
    public static void main(String[] args) {

        String parameter1 = "parameter_1";
        String parameter2 = "parameter_2";
        String parameter3 = "parameter_3";

        NoGenericMethods noGenericMethods1 = new NoGenericMethods(parameter1, parameter2, parameter3);
        NoGenericMethods noGenericMethods2 = new NoGenericMethods(parameter3, parameter1, parameter2);
        NoGenericMethods noGenericMethods3 = new NoGenericMethods(parameter2, parameter3, parameter1);

        System.out.println("First example: " + noGenericMethods1);
        System.out.println("First example: " + noGenericMethods2);
        System.out.println("First example: " + noGenericMethods3);

    }
}