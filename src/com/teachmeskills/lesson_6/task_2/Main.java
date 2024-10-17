package com.teachmeskills.lesson_6.task_2;
import java.util.Scanner;

/** Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Создайте один конструктор с двумя параметрами.
 * Создайте класс TransferService - сервис переводов.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Метод принимает на вход сумму и карту. Внутри метода создайте код, который добавляет переданную в метод сумму к текущей сумме на переданной в метод карте.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Метод принимает на вход сумму и карту. Внутри метода напишиет код, который отнимает переданную сумму от текущей суммы на переданной карте.
 * Добавьте метод, который выводит на консоль текущую информацию о карточке.
 * Продумайте и реализуйте различные проверки внтури методов по снятию/добавленрю: например, передана отрицательное число, передан 0, запрос на снятие суммы большей, чем сейчас на карте и другие возможные проверки.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreditCard card1 = new CreditCard("4448 4433 6789 6511", 666.66, 0.2);
        CreditCard card2 = new CreditCard("4456 7765 4432 1112", 777.77, 0.2);
        CreditCard card3 = new CreditCard("8765 4334 2332 1122", 889.90, 0.2);
        CreditCard card4 = new CreditCard("4334 7890 5455 1889", 1342.43, 0.2);
        CreditCard card5 = new CreditCard("4356 6667 8887 5443", 545.54, 0.2);

        TransferService service = new TransferService();

        System.out.println("Enter the amount to add to the card 1: ");
        double amount1 = scanner.nextDouble();
        service.addMoney(amount1, card1);

        System.out.println("Enter the amount to add to the card 2: ");
        double amount2 = scanner.nextDouble();
        service.addMoney(amount2, card2);

        System.out.println("Enter the amount to withdraw from the card 3: ");
        double amount3 = scanner.nextDouble();
        service.withdrawMoney(amount3, card3);

        System.out.println("Enter the amount to withdraw from the card 4: ");
        double amount4 = scanner.nextDouble();
        service.withdrawMoney(amount4, card4);

        System.out.println("Enter the amount to transfer from card 5 to card 1: ");
        double transferAmount = scanner.nextDouble();
        service.transferMoney(transferAmount, card5, card1);

        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
        card4.printCardInfo();
        card5.printCardInfo();
    }
}