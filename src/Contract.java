import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer numberContract;
    private Date date;
    private Double totalValue;

    public Contract (Integer numberContract, Date date, Double totalValue){
        this.numberContract = numberContract;
        this.date = date;
        this.totalValue = totalValue;
    }

    List <Installment> list = new ArrayList<>(); 

    public Integer getNumberContract(){
        return numberContract;
    }

    public void setNumberContract(Integer number){
        this.numberContract = number;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Double getTotalValue(){
        return totalValue;
    }

    public void setTotalValue(Double value){
        this.totalValue = value;
    }

    public List<Installment> getInstallments() {
		return list;
	}

    public void addInstallment(Installment installment){
        list.add(installment);
    }

    public void removeInstallment(Installment installment){
        list.remove(installment);
    }
}   