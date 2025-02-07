import java.util.*;
// import java.util.ArrayList;
// import java.util.List;

class Solution {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        List<Character> mismatch = new ArrayList<>();
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatch.add(s1.charAt(i));
                mismatch.add(s2.charAt(i));
                if (mismatch.size() > 4) return false; // More than 2 mismatches
            }
        }
        
        return mismatch.size() == 4 && mismatch.get(0) == mismatch.get(3) && mismatch.get(1) == mismatch.get(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input strings
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();
        
        // Call function and display result
        boolean result = areAlmostEqual(s1, s2);
        System.out.println("Are almost equal? " + result);
        
        scanner.close();
    }
}









