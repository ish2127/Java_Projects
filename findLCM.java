public class findLCM{
    public static int getgcd(int a,int b){
        while(b!=0){
            int r=a % b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String args[]){
        int x=22,y=11;
        int i,res;
        i=getgcd(x,y);
        res=(x * y)/i;
        System.out.print(res);
     
        
    }
}