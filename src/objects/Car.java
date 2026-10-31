package objects;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String licensePlate;
    private String vin;

    public Car(String brand, String model, String licensePlate, String vin) {
        this.licensePlate = licensePlate;
        this.vin = vin;
        this.model = model;
        this.brand = brand;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Brand " + brand + "; Model " + model + "; License Plate " + licensePlate + "; vin " + vin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj == null || getClass() != obj.getClass())) {
            return false;
        }

        Car car = (Car) obj;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
