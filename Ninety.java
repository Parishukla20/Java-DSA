//Parameterized Constructor()

  class Car{
        String name;
        String model;
        int price;
        Car(String name,String model,int price){
            this.name = name;
            this.model = model;
            this.price = price;
        }
        public void printDetails(){
            System.out.println(this.name);
            System.out.println(this.model);
            System.out.println(this.price);
        }
    }
    public class Ninety {
    public static void main(String args[]){
        Car car1 = new Car("Mercedes","Benz",9000000);
        car1.printDetails();
    }
}
