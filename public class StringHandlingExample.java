public class StringHandlingExample {

    public static void main(String[] args) {
       
        String str1 = "Test ";
        String str2 = "Process!";
        
        
        String result1 = str1 + str2;
        System.out.println("Concatenated String: " + result1);
        
      
        StringBuffer stringBuffer = new StringBuffer("Hi ");
        
        
        stringBuffer.append("Process ongoing");
        System.out.println("StringBuffer Content: " + stringBuffer);
        
     
        stringBuffer.insert(7, "awesome ");
        System.out.println("StringBuffer after Insertion: " + stringBuffer);
        
       
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);
}
}