public class shallowDeep25 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks [2] = 80;

        Student s2 = new Student(s1);// copy
        s2.password = "xyz";
        s1.marks[2] =100;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

//shallow copy constructor
Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll =s1.roll;
    this.marks = s1.marks;
}
   /*  // deep copy constructor
     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll =s1.roll;
        for(int i= 0; i<marks.length; i++){// for copy marks
            this.marks[i] = s1.marks[i];
        }

     }
         */
     Student() {
        marks = new int[3];  // Initialize marks array in default constructor
    }

}









