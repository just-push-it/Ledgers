package us.alitz.Ledgers.api;

public interface Account {
	
	/**
	 * Get the account ledger number.
	 * 
	 * @return GL Account number
	 */
	public int getNumber();
	
	/**
	 * Get the account ledger code.
	 * 
	 * @return GL Account code
	 */
	public String getCode();
	
	/**
	 * Get the human readable description 
	 * for this account.
	 * 
	 * @return GL Account description
	 */
	public String getDescription();
	
	/**
	 * Updates the account description with the
	 * provided value
	 * 
	 * @param New description for the account
	 */
	public void setDescription(String newDescription);
	
	/**
	 * Get the current GL Account balance based on the AccountBalances table.
	 * This is not a real time calculation, so there is no guarantee it matches
	 * what the calculated total from the chart of accounts would be.
	 * 
	 * If this number does not match the chart of accounts calculation, then there is
	 * either a data error, or an entry in the GL was manually updated without reflecting
	 * the change on the Account Balances table.
	 * 
	 * @return current account balance
	 */
	public double getBalance();
	
}
