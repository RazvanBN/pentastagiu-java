package module1week3.bank;

import module1week3.BankAppMain;

public class BankAccount extends BankAppMain {
    private String accountName;
    private String clientOne;
    private String clientTwo;
    private int accountTotal;

    public BankAccount(String accountName, String clientOne, String clientTwo, int accountTotal) {
        this.accountName = accountName;
        this.clientOne = clientOne;
        this.clientTwo = clientTwo;
        this.accountTotal = accountTotal;
    }

    public void deposit() {
        accountTotal = accountTotal + deposit;
        System.out.println("Client " + ((accountClient==1) ? clientOne + " added " +
                deposit : clientTwo + " added " + deposit));
        System.out.println("Current balance: " + accountTotal);
        System.out.println(" ");
    }
    public void withdraw() {
        if((accountTotal-withdraw) >= 0) {
            accountTotal = accountTotal - withdraw;
            System.out.println("Client " + ((accountClient==1) ? clientOne + " withdraw " +
                    withdraw : clientTwo + " added " + withdraw));
            System.out.println("Current balance: " + accountTotal);
            System.out.println(" ");
        } else {
            System.out.println("Transaction failed: You tried to withdraw more than your card balance!");
            System.out.println(" ");
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public String getClientOne() {
        return clientOne;
    }

    public String getClientTwo() {
        return clientTwo;
    }

    public int getAccountTotal() {
        return accountTotal;
    }
}
