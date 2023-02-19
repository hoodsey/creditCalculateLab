public class CreditPaymentService {
    public int calculate(int loanAmount, int year) {
        double annualRate = 9.99 / 100;// Рассчёт годовой ставки
        double monthlyRate = annualRate / 12;// Рассчёт месячной ставки
        int numberOfPayments = year * 12;// Рассчёт количества платежей
        double result = loanAmount * (monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments)) / (Math.pow((1 + monthlyRate), numberOfPayments) - 1);// Рассчёт платежа
        return (int) result;
    }
}
