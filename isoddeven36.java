import java.util.*;
public class isoddeven36 {
    public static void oddorEven(int n){
        int bitMask =1;
        if((n & bitMask) == 0){
            System.out.println(n + " "+"is even");
        }else{
            System.out.println(n + " "+ "is odd");
        }
    }
    public static void main (String args[]){
        oddorEven(3);
        oddorEven(10);
        oddorEven(33);
    }
    
}



