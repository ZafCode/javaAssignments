package com.cybertek.java_classes.Assignment_14.Question11;

public class SavingsAccount extends BankAccount{

    double interestRate;

    public double getInterestRate(){
        return interestRate;
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }
}
