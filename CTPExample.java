public class CTPExample {
    public static void main(String[] args) {


        SuperCar s = new SuperCar(20, 10);
        s.range();
        s.efficiencyReason();

        s.price();
        s.price(true);
        System.out.println(s.price(true, false));
        s.price(true, false);
        System.out.println(s.price(false, true));
    }
}
