public class ArrayList {
    private int[] arr;
    private int size;
    private int capacity;

    public ArrayListImplementation(int initialCapacity) {
        capacity = initialCapacity;
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (size == capacity) {
            // Double the capacity if the array is full
            int[] newArr = new int[2 * capacity];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
            capacity *= 2;
        }

        // Shift elements to make space for new data
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = data;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        // Shift elements to fill the gap left by deleted element
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean search(int data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(5);

        list.insert(10, 0);
        list.insert(20, 1);
        list.insert(30, 2);

        list.display(); // Output: 10 20 30

        list.delete(1);

        list.display(); // Output: 10 30

        System.out.println("Is 20 in the list? " + list.search(20)); // Output: Is 20 in the list? false
    }
}
