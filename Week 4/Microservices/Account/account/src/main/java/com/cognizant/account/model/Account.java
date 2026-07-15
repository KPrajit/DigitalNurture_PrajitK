package com.cognizant.account.model;

public class Account {
    private int number;
    private String type;
    private int balance;

    public Account() {
    }

    public Account(int number, String type, int balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
