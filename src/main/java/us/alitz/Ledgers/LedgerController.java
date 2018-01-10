package us.alitz.Ledgers;

import java.util.ArrayList;

import us.alitz.Ledgers.api.Account;
import us.alitz.Ledgers.api.Ledgers;
import us.alitz.Ledgers.api.Transaction;
import us.alitz.Ledgers.api.TransactionResult;
import us.alitz.Ledgers.api.TransactionType;
import us.alitz.Ledgers.database.Database;

public class LedgerController implements Ledgers {
	
	private Database db = null;

	@Override
	public ArrayList<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccount(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccount(String accountCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TransactionType> getTransactionTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionType registerTransactionType(char code, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account registerAccount(String code, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction createTransaction(Account from, Account to, TransactionType type, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionResult commitTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionResult cancelTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction createVoidTransaction(long transactionNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction getTransaction(long transactionNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
