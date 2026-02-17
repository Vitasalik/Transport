package Transport;

public class Car extends Transport implements PrivateTransport{


    public Car(String brand, String model, int year, double horsePower) {
        super(brand, model, year, horsePower);
    }

    @Override
    public void getNameCar() {
        System.out.println("Brand: " + this.brand + "\nModel: " + this.model);
    }

    @Override
    public String toString() {
        return "Car is " + this.brand + " " + this.model + " year: " + this.year;
    }
}
