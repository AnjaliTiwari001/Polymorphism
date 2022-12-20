public class SuperCar extends Car {
    public SuperCar(double fuel, double mileage) {
        super(fuel, mileage);
    }

    public double range() {
        return super.getFuel() * super.getMileage() * 1.5;
    }

    public String efficiencyReason() {
        return "Special PV Cells";
    }

    public double price() {
        return 1000;
    }

    public double price(boolean ac) {
        if (ac == true) {
            return 2000;
        } else {
            return price();
        }
    }

    public double price(boolean ac, boolean airBags) {
        if ((airBags == true) && (ac = true)) {
            return 5000;
        } else if ((airBags == true) && (ac = false)) {
            return 4000;
        } else {
            return price(ac);
        }
    }
}
