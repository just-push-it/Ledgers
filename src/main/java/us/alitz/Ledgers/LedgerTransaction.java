package us.alitz.Ledgers;

import us.alitz.Ledgers.api.Account;
import us.alitz.Ledgers.api.Transaction;
import us.alitz.Ledgers.api.TransactionStatus;
import us.alitz.Ledgers.api.TransactionType;

public class LedgerTransaction implements Transaction {
	private final long transNumber;
	private double transAmount;
	private TransactionStatus transStatus;
	
	public Account getFromAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	public Account getToAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public TransactionStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	public TransactionType getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
