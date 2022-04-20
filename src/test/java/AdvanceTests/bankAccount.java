package AdvanceTests;

public class bankAccount {
    private double balance;
    private double minimunBalance;

    private boolean isActive = true;

    private String holderName;

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public bankAccount(double balance, double minimunBalance){
        this.balance = balance;
        this.minimunBalance = minimunBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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

