public class Main {
    public static void main(String[] args) {
        CreditPaymentService serviceOne = new CreditPaymentService();
        long oneYear = serviceOne.calculate(1_000_000, 1, 9.99);
        System.out.println("Ваш ежемесячный платёж: " + oneYear);

        CreditPaymentService serviceTwo = new CreditPaymentService();
        long twoYear = serviceTwo.calculate(1_000_000, 2, 9.99);
        System.out.println("Ваш ежемесячный платёж: " + twoYear);

        CreditPaymentService serviceThree = new CreditPaymentService();
        long threeYear = serviceThree.calculate(1_000_000, 3, 9.99);
        System.out.println("Ваш ежемесячный платёж: " + threeYear);
    }
}
