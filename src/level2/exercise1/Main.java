package level2.exercise1;


import level2.exercise1.model.GenericAndNotGenericMethods;
import level2.exercise1.model.Person;


public class Main {
    public static void main(String[] args) {
        
        Person person1 = new Person("Juan", "Frutos", 48);

        GenericAndNotGenericMethods.showIntroducedParameters("Hello", 123, person1);
    }
}
