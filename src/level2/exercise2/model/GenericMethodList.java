package level2.exercise2.model;

import java.util.List;

public class GenericMethodList {

    public static <T> void genericList(List<T> listItems) {
		for (T item : listItems) {
			System.out.println(item);
		}
	}
	
}
