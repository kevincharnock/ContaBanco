package Tests;

import BankAccounts.BankAccount;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.addMoney(20.25);
        bankAccount.getBalance();


    }
}
