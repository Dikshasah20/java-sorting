public class constructor24 {
    public static void main(String[] args) {
        Student s1 = new Student ("Diksha");
        Student s2 = new Student();
        Student s3 = new Student(123);
        
    }
}
class Student{
    String name;
    int roll;

    Student (){
        System.out.println("Constructor is called...");
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;

    }
}
