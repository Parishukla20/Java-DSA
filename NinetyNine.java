//Abstraction in Java (Hiding unnecessary details)using abstract class and abstract keyword

abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class NinetyNine {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
