import java.util.*;
public class CollectionsDemo {
   public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("Zara");
      list.add("Mahnaz");
      list.add("Ayan");
      System.out.println("List: " + list);
      List<String> list1 = Arrays.asList("Zara","Mahnaz","Ayan" );
      System.out.println("List1: " + list1);
   }
}