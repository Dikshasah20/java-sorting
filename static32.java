public class static32 {
    public static void main(String[] args) {
        
   
    Student s1 = new Student();
    s1.schoolName = "JMV";
    

    

    Student s3 = new Student();
    s3.schoolName = "ABC";
    // System.out.println(s3.schoolName);
    Student s2 = new Student();
    System.out.println(s2.schoolName); // sab jagah abc ho jayega 

     }
    
}
class Student{
    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }


    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}



