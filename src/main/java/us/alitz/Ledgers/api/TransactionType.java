package us.alitz.Ledgers.api;

public interface TransactionType {
	
	/**
	 * Get the type code for the transaction (e.g. S for Sale)
	 * 
	 * @return transaction type code
	 */
	public String getCode();
	
	/**
	 * Get the human friendly description of the transaction type
	 * 
	 * @return transaction type description
	 */
	public String getDescription();
	
	/**
	 * 
	 * @return can transaction type be voided
	 */
	public boolean isVoidable();
}
