import java.util.ArrayList;
import java.util.List;

public class ArrayToListExample {
    public static void main(String[] args) {
        // Creating an array
        String[] array = {"Apple", "Banana", "Orange", "Grapes"};

        // Creating a list from the array
        List<String> list = new ArrayList<>(Arrays.asList(array));

        // Printing the list
        System.out.println(list);
    }
}