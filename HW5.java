import java.util.*;
// [3,6,2,1,8,7,4,5,3,1]
public class HW5 {
    public static void bubbleSort(int arr[]){
        for(int turn =0; turn<= arr.length; turn++){
            for(int j = 0; j< arr.length-1-turn;  j++){
                if(arr [j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }

    }

    // selection
    public static void sellection(int arr[]){
        for(int i = 0 ; i < arr.length-2; i++){
            int minPos = i;
            for(int j = i+1; j<= arr.length-1; j++){
                if(arr[minPos] < arr[j]){
                    minPos= j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] =temp;

        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);
        sellection(arr);
        printArr(arr);
    }


    
}

