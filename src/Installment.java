import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    
    private Date dueDate;
    private Double amount;

    private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyyy");

    public Installment( Date dueDate, Double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Double getAmount(){
        return amount;
    }

    public void setAmount(Double amount) {
		this.amount = amount;
	}

    public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

    public Date getDate(){
        return dueDate;
    }

    @Override
    public String toString(){
        return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
    }
}