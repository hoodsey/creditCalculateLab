public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000;
        for (int year = 1; year <= 3; year++) {
            int payment = service.calculate(loanAmount, year);
            System.out.println(payment);
        }
    }
}