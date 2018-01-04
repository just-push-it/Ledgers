package us.alitz.Ledgers.api;

public interface TransactionResult {
	
	/**
	 * Check if the transaction was committed successfully 
	 * @return was commit successful
	 */
	public boolean wasSuccessfull();
	
	/**
	 * Get error message from commit attempt
	 * @return commit error message
	 */
	public String getError();
}
