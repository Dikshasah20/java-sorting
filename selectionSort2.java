import java.util.*;
public class selectionSort2 {
    public static void Selection(int arr[]){
        for(int turn = 0; turn<= arr.length-2; turn++){
            int minPos = turn;
            for(int j= turn+1; j<=arr.length-1; j++){
                if(arr[minPos] > arr[j]){
                    minPos= j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;


        }

    }
    public static void print(int arr[]){
        for(int i=0 ; i<=arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,9,54,75,1,0,6};
        Selection(arr);
        print(arr);
    
    }
}











