package com.green.www;

public class BankAccount {

	int accountNumber;
	String owner;
	public int balance;
	
	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		balance-=amount;
	}
	@Override
	public String toString() {
		return "현재 잔액은"+balance;
	}
}
