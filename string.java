public class string{

    public static void main(string[] args) {
       
        String str1 = "Test ";
        String str2 = "Process!";
        
        
        String result1 = str1 + str2;
        System.out.println("Concatenated string: " + result1);
        
      
        stringBuffer stringBuffer = new stringBuffer("Hi ");
        
        
        stringBuffer.append("Process ongoing");
        System.out.println("StringBuffer Content: " + stringBuffer);
        
     
        stringBuffer.insert(7, "awesome ");
        System.out.println("StringBuffer after Insertion: " + stringBuffer);
        
       
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);
    }
}