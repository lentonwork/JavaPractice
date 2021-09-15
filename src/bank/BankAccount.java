package bank;

public class BankAccount {
    public float getBalance() {
        return balance;
    }

    private float balance;

    public void withdraw(float change){
        if(change <= 500){
            balance = balance - change;
        }
        else{
            System.out.println("Exceeded max withdrawal amount!");
        }

    }

    public void deposit(float change){
        if(change <= 500){
            balance = balance + change;
        }
        else{
            System.out.println("Exceeded max deposit amount!");
        }

    }

    public static void main(String[] args) {
        BankAccount dave = new BankAccount();

        dave.deposit(300.00F);
        dave.withdraw(100.00F);

        System.out.println(dave.balance);
    }
}
