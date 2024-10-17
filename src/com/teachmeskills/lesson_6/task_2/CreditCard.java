package com.teachmeskills.lesson_6.task_2;

public class CreditCard {
    public String accountNumber;
    public double currentBalance;
    public double loanInterestRate;

    public CreditCard(String accountNumber, double currentBalance, double loanInterestRate) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.loanInterestRate = loanInterestRate;

    }

    public void printCardInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current amount: " + currentBalance);
        System.out.println("Loan interest rate: " + loanInterestRate);
        System.out.println("\n");

        }
}

