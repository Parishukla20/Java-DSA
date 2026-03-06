//OOPS in Java 

class Pen{
    String color;
    String type; //gel or ball

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
public class EightyEight {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";
        
        pen1.printType();
        pen1.write();
        pen1.printColor();
        pen2.printType();
        pen2.write();
        pen2.printColor();
    }
}
