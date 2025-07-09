package level2.exercise2;

import level2.exercise2.model.GenericMethodList;
import level2.exercise2.model.Person;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("John", "Lennon", 40);
        Person person2 = new Person("Paul","McCartney", 83);

        System.out.println("Es passen 3 arguments al mètode printUndefinedNumberOfArguments:");
        GenericMethodList.printUndefinedNumberOfArguments("Yesterday", 1960, person1);

        System.out.println("\nEs passen 5 arguments al mètode printUndefinedNumberOfArguments:");
        GenericMethodList.printUndefinedNumberOfArguments("Yesterday" ,person2 , "Let it be", person1, 1960);
    }
}
