public class GCD{
    public static int getgcd(int a,int b){
        while(b!=0){
            int r=a % b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String args[]){
        int i;

        i=getgcd(22,11);
        System.out.print(i);
     
        
    }
}