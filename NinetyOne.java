//Copy Constructor
//copy car1 properties inot car2

class Car{
        String name;
        String model;
        int price;
        Car(Car car2){
            this.name = car2.name;
            this.model = car2.model;
            this.price = car2.price;
        }
        public void printDetails(){
            System.out.println(this.name);
            System.out.println(this.model);
            System.out.println(this.price);
        }
        Car(){

        }
    }
public class NinetyOne {
    public static void main(String args[]){
        Car car1 = new Car();
        car1.name = "Mercedes";
        car1.model = "Benz";
        car1.price = 9000000;
        Car car2 = new Car(car1);
        car2.printDetails();
    }
}
