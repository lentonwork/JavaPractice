package Arrays;
import bank.BankAccount;

public class AccountArrays {
    public static void main(String[] args) {
        BankAccount Steve = new BankAccount();
        BankAccount[] Grads = new BankAccount[10];
        Grads[1] = Steve;
        System.out.println(Grads[1].getBalance());


        // Loops
        for(BankAccount i: Grads){
            if(i != null) {
                System.out.println(i.getBalance());
            }
            else{
                System.out.println("Is null");
            }
        }
    }
}
