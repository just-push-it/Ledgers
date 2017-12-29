package us.alitz.Ledgers.api;

public interface Transaction {
	
	public Account getFromAccount();
	
	public Account getToAccount();
	
	public double getAmount();
	
	public TransactionStatus getStatus();
	
	public TransactionType getType();
	
	
}
