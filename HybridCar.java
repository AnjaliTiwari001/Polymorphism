public class HybridCar extends Car {
    public HybridCar(double fuel, double mileage) {
        super(fuel, mileage);
    }

    public double range() {
        return super.getFuel() * super.getMileage() * 1.1;
    }
}
