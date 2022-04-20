package basicTests;

public class bankAccount {
    private double balance;
    private double minimunBalance;

    public bankAccount(double balance, double minimunBalance){
        this.balance = balance;
        this.minimunBalance = minimunBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimunBalance() {
        return minimunBalance;
    }

    public double withdraw(double amount){

        if( balance - amount >  minimunBalance){
            balance = balance - amount;
            return amount;
        }
        else {
            throw new RuntimeException();
        }

    }

    public double deposit(double amount){
        return balance += amount; //adding the amount to the balance
    }
}

