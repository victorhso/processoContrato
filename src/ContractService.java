import java.util.Calendar;
import java.util.Date;

public class ContractService {
    
    private IOnlinePayment paymentOnline;

    public ContractService (IOnlinePayment paymentOnline){
        this. paymentOnline = paymentOnline;
    }

    public void processContract(Contract contract, int months){
        double quota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){
            Date data = addMonths(contract.getDate(), i);
            double upQuota = quota + paymentOnline.interest(quota, i);
            double fullQuota = upQuota + paymentOnline.paymentFree(upQuota);  
            contract.addInstallment(new Installment(data, fullQuota));
        }
    }

    private Date addMonths(Date date, int x){
        Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, x);
		return cal.getTime();
    }
}                                                                                                   