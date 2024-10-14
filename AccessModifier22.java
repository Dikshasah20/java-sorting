public class AccessModifier22 {

    public static void main(String[] args) {
        
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Dikshasah";
    myAcc.setPassword("fghjghjj");
    }

}
class BankAccount{
    public String username;
    private String password;
    public void setPassword (String pwd){
        password = pwd; // class and function k ander hm private chiz ko access kr rhe
    }
}
