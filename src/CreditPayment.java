public class CreditPayment {
    public double calculate(double mounth, double sum) {
        double interestRate = 9.99;
        double s = interestRate / 12 / 100;
        double q = 1 + s;
        double w = Math.pow(q, mounth);


        double payment = sum * (s * w / (w - 1)) ;
        double roundOff = Math.round(payment * 100) / 100.00;
        return roundOff;
    }
}
