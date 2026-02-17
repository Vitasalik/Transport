import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car cr = new Car("BMW", "X3", 2020, 249.0);

        cr.getNameCar();
        System.out.println(cr.toString());
    }
}