package us.alitz.Ledgers;

import us.alitz.Ledgers.api.Account;

public class LedgerAccount implements Account {
	private final int accountNumber;
	private final String accountCode;
	
	private String accountDescription;
	private double currentBalance;
	
	public LedgerAccount(int accountNumber, String accountCode, String description, double balance) {
		this.accountNumber = accountNumber;
		this.accountCode = accountCode;
		this.accountDescription = description;
		this.currentBalance = balance;
	}
	
	public int getNumber() {
		return this.accountNumber;
	}
	
	public String getCode() {
		return this.accountCode;
	}
	
	public String getDescription() {
		return this.accountDescription;
	}
	
	public void setDescription(String newDescription) {
		this.accountDescription = newDescription;
		// TODO: Update database
	}
	
	public double getBalance() {
		return this.currentBalance;
	}
	
	
}
