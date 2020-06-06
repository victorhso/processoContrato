public interface IOnlinePayment {
    
    Double paymentFree(Double amount);

    Double interest(Double amount, int months);
}