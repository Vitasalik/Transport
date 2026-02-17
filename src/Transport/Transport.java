package Transport;

public abstract class Transport {

    String brand;
    String model;
    int year;
    double horsePower;

    public Transport(String brand, String model, int year, double horsePower){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
    };

    @Override
    public abstract String toString();
}
