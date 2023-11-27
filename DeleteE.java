import java.util.Scanner;
public class DeleteE
{
public static void main(String[] args) 
{
int n = 5, x = 10, flag = 1, loc = 0;
Scanner s = new Scanner(System.in);
int intArr[] = new int[n];
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
for (int i = 0; i < n; i++) 
{
if(intArr[i] == x)
{
flag =1;
loc = i;
break;
}
else
{
flag = 0;
}
}
if(flag == 1)
{
for(int i = loc+1; i < n; i++)
{
intArr[i-1] = intArr[i];
}
System.out.print("\nArray elements after deleting:");
for (int i = 0; i < n-2; i++) 
{
    System.out.print(intArr[i]+" ");
}
System.out.print(intArr[n-2]);
}
else
{
System.out.println("Element not found");
}
}
}
