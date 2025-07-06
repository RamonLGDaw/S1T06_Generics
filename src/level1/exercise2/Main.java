package level1.exercise2;

import level1.exercise2.model.GenericMethods;
import level1.exercise2.model.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Juan","Frutos",48);

        GenericMethods.showIntroducedParameters(person1, "Hello World", 33);
    }

}
