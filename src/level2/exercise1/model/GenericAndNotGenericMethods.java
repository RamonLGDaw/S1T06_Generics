package level2.exercise1.model;


public class GenericAndNotGenericMethods {

    public static <T, K>void showIntroducedParameters(T firstParameter, K secondParam, Person thirdParam) {
        System.out.println("| " + firstParameter + " | " + secondParam + " | " + thirdParam + " |");
    }

}
