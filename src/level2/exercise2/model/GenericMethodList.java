package level2.exercise2.model;

public class GenericMethodList {

    public static <T> void printUndefinedNumberOfArguments(T... arguments) {
        for (T argument : arguments) {
            System.out.println("- " + argument);
        }
    }


}
