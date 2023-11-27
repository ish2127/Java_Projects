import java.util.Scanner;
public class InsertA
{
 public static void main(String[] args) 
 {
 int n = 5, pos, x;
 int intArr[] = new int[n+1];
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the array elements : ");
 for(int i = 0; i < n; i++)
 {
 intArr[i] = sc.nextInt();
 }
 System.out.println("Array elements before insertion : ");
 for(int i = 0 ;i < n ; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 pos = 3;
 x = 24;
 for(int i = (n-1); i >= (pos-1); i--)
 {
 intArr[i+1] = intArr[i];
 }
 intArr[pos-1] = x;
 System.out.println("\nArray elements after insertion:");
 for(int i = 0; i < n; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 System.out.print(intArr[n]);
 }
}
