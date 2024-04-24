package org.example;

public class SavingAccount extends BankAccount{
    private double intrestRate;

    public SavingAccount(double balance, double intrestRate) {
        super(balance);
        this.intrestRate = intrestRate;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    @Override
    public double calculateInterest() {
        double total = getBalance() * getIntrestRate();
        total += getBalance();
        return total;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "intrestRate=" + intrestRate +
                '}';
    }
}
