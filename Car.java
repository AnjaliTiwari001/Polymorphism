public class Car{
    private double fuel;
    private double mileage;

    public Car(double fuel, double mileage){
        super();
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public double range(){
        return this.fuel * this.mileage;
    }

    public double getFuel(){
        return this.fuel;
    }

    public double getMileage(){
        return this.mileage;
    }
}





