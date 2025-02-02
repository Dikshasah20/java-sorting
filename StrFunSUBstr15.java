public class StrFunSUBstr15 {
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i =si; i<ei; i++){
            substr += str.charAt(i);//concatenate with charector
        }
        return substr;

    }
    public static void main(String[] args) {
        //Substring
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));// Hello
    }
}










