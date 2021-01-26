public class CreditPaymentService {
    public int calculate (long summa, int duration, double percent) {
        double monthlyInterestRate = percent / 12 / 100;
        int months = duration * 12;
        double coefficient = Math.pow((1 + monthlyInterestRate), months);
        double annuityRatio = monthlyInterestRate * (coefficient / (coefficient - 1));
        double payment = annuityRatio * summa;

        return (int) payment;
    }
}
