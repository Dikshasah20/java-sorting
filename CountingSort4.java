public class CountingSort4 {
    public static void CountingSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest + 1];
        for(int i = 0 ; i< arr.length; i++)
    }
    public static void print(int arr[]){
        for(int i =0; i<=arr.length ; i++){
            System.out.println(arr + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,2,3,2};
        CountingSort(arr);
    }
}
// basically it count the frequency