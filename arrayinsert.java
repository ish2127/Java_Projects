import java.util.Arrays; 
import java.util.Scanner;

public class arrayinsert
{
    public static int[] addElement(int n, int arr[], int ele, int pos) 
    { 
        int i; 
  

        int newarr[] = new int[n + 1]; 
     
        for (i = 0; i < n + 1; i++) 
        { 
            if (i < pos - 1) 
                newarr[i] = arr[i];  
            else if (i == pos - 1) 
                newarr[i] = ele;     
            else
                newarr[i] = arr[i - 1]; 
        } 
        return newarr; 
    } 
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n; 
        System.out.println("Enter the number of elements :");
        n=sc.nextInt(); 
        
        int arr[]=new int[n];  
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements you want to insert :");
        int ele = sc.nextInt(); 
        System.out.println("Enter the position where you want to insert :");
        int pos = sc.nextInt(); 
      
        arr = addElement(n, arr, ele, pos); 
 
        System.out.println("\nArray with " + ele  + " inserted at position " + pos + ":\n" + Arrays.toString(arr)); 
        
    }
}
