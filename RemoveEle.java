import java.util.ArrayList;  
  
public class RemoveEle{  
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
        
      arr.remove("GOKUL");  
  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
        
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  