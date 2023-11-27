import java.util.ArrayList;  
  
public class UpdateEle{  
   public static void main(String[] args) {  
        
      ArrayList<String> arr = new ArrayList<String>(5);  
      arr.add("ISHA");  
      arr.add("AASTHA");  
      arr.add("GOKUL");  
      arr.add("SANJAY");  
  
      System.out.println("The list of the size is: " + arr.size());  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
      arr.set(2,"AAMAYA");
      System.out.println("\nAfter UPDATEING the element the size of the ArrayList is: " + arr.size());  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  