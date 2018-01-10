package us.alitz.Ledgers;

import us.alitz.Ledgers.api.Account;
import us.alitz.Ledgers.api.Transaction;
import us.alitz.Ledgers.api.TransactionStatus;
import us.alitz.Ledgers.api.TransactionType;

public class LedgerTransaction implements Transaction {
	private final long transNumber;
	private final double transAmount;
	private final Account from;
	private final Account to;
	private final TransactionType type;
	private TransactionStatus transStatus;
	
	// Transaction objects should only be created by the ledger controller
	private LedgerTransaction(long transNumber, Account from, Account to, TransactionType type, double amount, TransactionStatus status) {
		this.from = from;
		this.to = to;
		this.type = type;
		this.transAmount = amount;
		this.transStatus = status;
		this.transNumber = transNumber;
	}
	
	public Account getFromAccount() {
		return this.from;
	}
	public Account getToAccount() {
		return this.to;
	}
	public double getAmount() {
		return this.transAmount;
	}
	public TransactionStatus getStatus() {
		return this.transStatus;
	}
	public TransactionType getType() {
		return this.type;
	}

	public long getTransactionNumber() {
		return this.transNumber;
	}
	
	protected void setStatus(TransactionStatus newStatus) {
		this.transStatus = newStatus;
	}
	
	
}
