public class BubbleSort {
    public int bubbleSort(int x) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] s_arr = new int[arr.length];
        for (int j : arr) {
            System.out.println("Original array: " + arr[j]);
        
        }
        
        s_arr=bubbleSort(arr);
        for (int j : arr) {
            System.out.println("Original array: " + s_arr[j]);
        
        }
          }
}