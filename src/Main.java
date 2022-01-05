public class Main {
    public static void main(String [] args) {
        CreditPayment service = new CreditPayment();
        double mounth = 24;
        double sum = 1_000_000;
        double bmi = service.calculate(mounth, sum);
        System.out.println(bmi);
    }
}
