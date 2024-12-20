package com.mybank.domain;

public class Account {
    
    protected double balance;
    protected String name;
    
    protected Account(double initBalance) {
        balance = initBalance;
    }
    
    public Account(String name){
      balance = 0;
      this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }
    
    public boolean withdraw(double amt) {
        boolean result = false;  // assume operation failure
        if ( amt <= balance ) {
            balance = balance - amt;
            result = true;  // operation succeeds
        }
        return result;
    }
}
