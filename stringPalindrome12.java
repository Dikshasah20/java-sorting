public class stringPalindrome12 {
    // same alphabet repeat from both side "racecar" , "noon", "madam"
    public static boolean isPalindrome(String str){
        for(int i = 0 ; i< str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not palindrome
                return false;

            }

        }
        return true;
    }
    public static void main (String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    
}
// TC: O(n)
