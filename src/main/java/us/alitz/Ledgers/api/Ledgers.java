package us.alitz.Ledgers.api;

import java.util.ArrayList;

public interface Ledgers {
	
	/**
	 * Get an array list of all currently tracked accounts
	 * 
	 * @return all accounts
	 */
	public ArrayList<Account> getAccounts();
	
	/**
	 * Get a specific account by ID
	 * 
	 * @param accountID
	 * @return a single account
	 */
	public Account getAccount(int accountID);
	
	/**
	 * Get a specific account by account code
	 * 
	 * @param accountCode
	 * @return a single account
	 */
	public Account getAccount(String accountCode);
	
	/**
	 * Get a list of all possible transaction types
	 * 
	 * @return all transaction types
	 */
	public ArrayList<TransactionType> getTransactionTypes();
	
	/**
	 * Register a new transaction type. Transaction types can not be deleted
	 * once registered. Especially if there are transactions in the ledger with
	 * that type. Transaction type codes must be unique. If a code already exists
	 * for the provided character, the description is updated and a TransactionType
	 * object returned. 
	 * 
	 * @param code
	 * @param description
	 * @return the new transaction type
	 */
	public TransactionType registerTransactionType(char code, String description);
	
	/**
	 * Register a new ledger account. The code and description are provided, and
	 * an account number is generated. Account codes must be unique.
	 * 
	 * @param code
	 * @param description
	 * @return newly generated account object
	 */
	public Account registerAccount(String code, String description);
	
	/**
	 * Creates a pending transaction in the ledger and returns the new 
	 * transaction object. Uncommitted transactions will be voided upon
	 * server shutdown and on startup in the event of an improper shutdown.
	 * 
	 * @param account to move funds from
	 * @param account to move funds to
	 * @param transaction type
	 * @param amount to move
	 * @return uncommitted transaction
	 */
	public Transaction createTransaction(Account from, Account to, TransactionType type, double amount);
	
	/**
	 * Commit the provided transaction to the ledger and update the accounts.
	 * 
	 * @param transaction to commit
	 * @return transaction result
	 */
	public TransactionResult commitTransaction(Transaction t);
	
	/**
	 * Cancel the provided transaction. Returns result of cancellation in
	 * the form of a transaction result. 
	 * 
	 * @param transaction to cancel
	 * @return transaction cancel result
	 */
	public TransactionResult cancelTransaction(Transaction t);
	
	/**
	 * Create a void transaction, which will reverse the transaction that
	 * correlates with the provided transaction number. Not all transaction
	 * types can be voided, but a void transaction will always be returned,
	 * which will fail upon commit.
	 * 
	 * @param transactionNumber
	 * @return void transaction
	 */
	public Transaction createVoidTransaction(long transactionNumber);

	/**
	 * Get a transaction by its transaction number. 
	 * May return null if no transaction is found.
	 * 
	 * @param transactionNumber
	 * @return transaction
	 */
	public Transaction getTransaction(long transactionNumber);
	
}
