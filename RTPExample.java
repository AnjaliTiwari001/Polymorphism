
    public class RTPExample{
        public static void main(String[] args){
            Car c = new Car(20, 10);
            c.range();

            Car c1 = new Car(30, 7);
            c1. range();

            HybridCar h = new HybridCar(20, 10);
            h.range();

            SuperCar s = new SuperCar(20, 10);
            s.range();
            s.efficiencyReason();

            Car c2 =new SuperCar(20, 10);
            c2.range();
//            c2.efficiencyReason();    exception because as c2 is referring to car but it does not have any object as effeciencyreason

            Car c3 = h;
            System.out.println(c3.range());

            Car c4 = s;
            c4.range();
//        c4.efficiencyReason();
//
        }
    }

