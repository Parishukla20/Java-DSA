//OOPS in Java

class Student{
    String name;
    int rollNo;
    Student(){
        System.out.println("constructor called");
    }
    public void name(){
        System.out.println(this.name);
    }
    public void rollNo(){
        System.out.println(this.rollNo);
    }
    public void Study(){
        System.out.println("I am reading");
    }
}
public class EightyNine {
    public static void main(String args[]){
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name ="Pari Shukla";
        stu1.rollNo = 10;
        stu2.name = "Prerna Shukla";
        stu2.rollNo = 11;

        stu1.name();  //get name
        stu1.rollNo();
        stu1.Study();
        stu2.name();
        stu2.rollNo();
        stu2.Study();
    }
}


