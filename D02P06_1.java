package com.learning.core.day2session1;

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (accType.equals("Saving") && initialBalance < 1000) {
            System.out.println("LowBalance");
            return;
        } else if (accType.equals("Current") && initialBalance < 5000) {
            System.out.println("LowBalance");
            return;
        }
        if (initialBalance < 0) {
            System.out.println("NegativeAmount");
            return;
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) {
        if (amt < 0) {
            System.out.println("NegativeAmount");
            return;
        }
        balance += amt;
    }

    public float getBalance() {
        return balance;
    }
}

public class D02P06_1 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(123, "John", "Saving", 900);
        acc1.deposit(-900); // Output: NegativeAmount
    }
}