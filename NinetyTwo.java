//Polymorphism (Overloading)

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class NinetyTwo {
    public static void main(String args[]){
        Student stu1 = new Student();
        stu1.name = "Pari";
        stu1.age = 21;
        stu1.printInfo(stu1.age);
    }
}
