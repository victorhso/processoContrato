import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("-----------Entre com o contrato-----------");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data: (dd/MM/yyyy:) ");
        Date date = sdf.parse(sc.next());
        System.out.print("Valor total: R$");
        double totalValue = sc.nextDouble();
        
        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Número de parcelas: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PayPal());

        contractService.processContract(contract, installments);

        System.out.println("Parcelas");
        for (Installment x : contract.getInstallments()){
            System.out.println(x);
        }

        sc.close();
    }
}
