public class Main {
    public static void main(String [] args) {
        CreditPayment service = new CreditPayment();
        double mounth = 12;
        double sum = 1_000_000;
        double bmi = service.calculate(mounth, sum);
        System.out.println(bmi);

        mounth = 24;
        double bms = service.calculate(mounth, sum);
        System.out.println(bms);

        mounth = 36;
        double bmw = service.calculate(mounth, sum);
        System.out.println(bmw);
    }

}
