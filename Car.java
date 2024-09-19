public class Car {
    String brand;
    int year;
    public Car(){
        brand = "Unknown";
        year = 0;
    }

    public void display(){
        System.out.println("Brand : "+brand+" Year : "+year);
    }
}
