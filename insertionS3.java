public class insertionS3 {
    public static void insertionsort(int arr[]){
        for(int i=1 ; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // findout the correct position to insert
            while(prev >=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
                //insertion
                arr[prev+1] = curr;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        print(arr);
    }
}
//it is same like arranging of cards


















