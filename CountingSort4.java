public class CountingSort4 {
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // corrected to "i < arr.length"
            System.out.print(arr[i] + " "); // corrected to print arr[i] and use print instead of println for same-line output
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3, 2}; // corrected to int instead of Integer
        CountingSort(arr);
        print(arr);
    }
}
