public class LCN{
    
    public static void main(String args[]){
        int i = 72, j = 120, lc;
      lc=(i > j) ? i : j;
      while(true){
        if(lc%i==0 && lc%j==0){
            System.out.print(i);
            break;
        }
        ++lc;
      }
     
     
        
    }
}