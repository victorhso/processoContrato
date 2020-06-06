
public class PayPal implements IOnlinePayment {

    private static final double feePercentage = 0.02;
    private static final double monthInterest = 0.01;

    @Override
    public Double paymentFree(Double amount) {
        return amount * feePercentage;
    }

    @Override
    public Double interest(Double amount, int months) {
        return amount * monthInterest * months;
    }
}