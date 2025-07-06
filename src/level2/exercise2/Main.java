package level2.exercise2;

import java.util.ArrayList;
import java.util.List;

import level2.exercise2.model.GenericMethodList;
import level2.exercise2.model.Person;

public class Main {


    public static void main(String[] args) {

        List<String> animalsList = new ArrayList<>();
        animalsList.add("Horse");
        animalsList.add("Bird");
        animalsList.add("Lion");

        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Juan", "Garcia", 22));
        personsList.add(new Person("María", "Lopez", 32));
        personsList.add(new Person("Paula", "Perez", 42));

        GenericMethodList.genericList(animalsList);
        GenericMethodList.genericList(personsList);
    }
}
