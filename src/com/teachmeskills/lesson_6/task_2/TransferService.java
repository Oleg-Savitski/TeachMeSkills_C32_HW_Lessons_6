package com.teachmeskills.lesson_6.task_2;

public class TransferService {
    private static final double withdrawalFeePercentage = 0.2;

    public void addMoney(double amount, CreditCard card) {

        if (amount <= 0) {
            System.out.println("You cannot add a negative or zero amount. ");
            return;
        }
        card.currentBalance += amount;
        System.out.println("The amount has been added to the card - " + card.accountNumber);
    }

    public void withdrawMoney(double amount, CreditCard card) {

        if (amount <= 0) {
            System.out.println("You cannot withdraw a negative or zero amount! ");
            return;
        }

        double fee = amount * withdrawalFeePercentage;
        double totalAmount = amount + fee;

        if (amount > card.currentBalance) {
            System.out.println("Insufficient funds on the card! " + card.accountNumber);
            return;
        }
        card.currentBalance -= amount;

        System.out.println("The amount has been withdrawn from the card: " + card.accountNumber);
    }

    public void transferMoney(double amount, CreditCard fromCard, CreditCard toCard) {
        if (amount <= 0) {
            System.out.println("You cannot transfer a negative or zero amount! ");
            return;
        }

        if (amount > fromCard.currentBalance) {
            System.out.println("Insufficient funds on the card " + fromCard.accountNumber + " for translation.");
            return;
        }

        fromCard.currentBalance -= amount;
        toCard.currentBalance += amount;
        System.out.println("The amount " + amount + " transferred from the card " + fromCard.accountNumber + " to the card " + toCard.accountNumber);
        System.out.println("\n");
    }
}