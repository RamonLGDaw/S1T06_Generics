package level1.exercise2.model;

public class GenericMethods {

    public static <T, K, Y>void showIntroducedParameters(T firstParam, K secondParam, Y thirdParam) {
        System.out.println("| " + firstParam + " | " + secondParam + " | " + thirdParam + " |");
    }
}
