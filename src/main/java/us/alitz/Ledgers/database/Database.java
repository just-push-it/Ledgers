package us.alitz.Ledgers.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.UUID;

import us.alitz.Ledgers.api.TransactionType;

public interface Database {
	
	/**
	 * Get the database connection
	 * 
	 * @return database connection
	 */
	public Connection getConnection();
	
	/**
	 * Test database connection
	 * 
	 * @return if the database connection is good
	 */
	public boolean testConnection();
	
	/**
	 * Get the settings type list, including their defaults
	 * 
	 * @return list of possible settings
	 */
	public ResultSet getSettingsList();
	
	/**
	 * Get the currently assigned setting values
	 * 
	 * @return list of current settings
	 */
	public ResultSet getSettingValues();
	
	/**
	 * Gets all transaction types
	 * 
	 * @return all transaction types
	 */
	public ResultSet getTransactionTypes();
	
	/**
	 * Gets a transaction by it's transaction number
	 * 
	 * @param transactionNumber
	 * @return transaction information
	 */
	public ResultSet getTransaction(int transactionNumber);
	
	//TODO: Need to figure out a way to include search parameters
	public ResultSet getTransactions();
	
	public ResultSet getAccounts();
	
	public ResultSet getAccount(int accountNumber);
	
	public ResultSet getAccount(String accountCode);
	
	/**
	 * Get a players balances for all player GL accounts
	 * 
	 * @param playerUUID
	 * @return 
	 */
	public ResultSet getPlayerBalances(UUID playerUUID);
	
	/**
	 * Get a players balance for the main player GL account
	 * 
	 * @param playerUUID
	 * @param accountNumber
	 * @return
	 */
	public ResultSet getPlayerBalance(UUID playerUUID, int accountNumber);
	
	/**
	 *  This method should not be called directly.
	 *  Transactions need to be created in this order to prevent transaction number conflicts:
	 *  1. LedgerController.createTransaction
	 *  2. This method
	 *  3. Return transaction result set, with transaction number
	 *  4. LedgerControllers creates LedgerTransaction object
	 *  
	 *  Result set returns with transaction number, and a status of "P" for Pending
	 *  
	 * @param transaction amount
	 * @param from account
	 * @param to account
	 * @param transaction type
	 * @return complete transaction information
	 */
	public ResultSet createLedgerTransaction(double amount, int from, int to, TransactionType type);
	
	public ResultSet createPlayerTransaction(double amount, UUID from, UUID to, int ledgerAccount, TransactionType type);
	
	public ResultSet createAccount();
	
	public ResultSet createTransactionType();
	
	
}
