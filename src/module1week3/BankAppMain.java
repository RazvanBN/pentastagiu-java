package module1week3;

import module1week3.bank.BankAccount;


import java.util.Scanner;

public class BankAppMain{
    protected static int deposit;
    protected static int withdraw;
    protected static int accountClient;


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int transactionOption;
        int menu = 1;

        BankAccount account = new BankAccount("Razvan Bacanu","Razvan Bacanu","Popescu Maria", 10000 );

        System.out.println("Debit card holder: " + account.getAccountName());
        System.out.println("Registered clients that can make transaction: " + account.getClientOne() + ", " + account.getClientTwo());
        System.out.println("Current card balance: " + account.getAccountTotal());

        while(menu == 1) {
            System.out.println("Select client:");
            System.out.println("1 - " + account.getClientOne());
            System.out.println("2 - " + account.getClientTwo());
            accountClient = userInput.nextInt();
            if(accountClient==1 || accountClient==2) {
                System.out.println("Please choose an option:");
                System.out.println("1 - Deposit");
                System.out.println("2 - Withdraw");
                System.out.println("3 - Show current balance");
                transactionOption = userInput.nextInt();

                if (transactionOption == 1) {
                    System.out.print("Please enter how much you want to deposit: ");
                    deposit = userInput.nextInt();
                    account.deposit();

                }
                if (transactionOption == 2) {
                    System.out.print("Please enter how much you want to withdraw: ");
                    withdraw = userInput.nextInt();
                    account.withdraw();
                }
                if (transactionOption == 3) {
                    System.out.println("Current card balance: " + account.getAccountTotal());
                    System.out.println(" ");
                }

                if (transactionOption >= 1 && transactionOption <= 3) {
                    System.out.println("Select options: ");
                    System.out.println("1 - Return to menu");
                    System.out.println("2 - Exit");
                    menu = userInput.nextInt();
                    if(menu==2) {
                        System.out.println("Goodbye!");
                    }
                } else {
                    System.out.println("Invalid operation!");
                }
            } else {
                System.out.println("Invalid client!");
            }
        }
    }

}
