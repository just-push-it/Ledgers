package us.alitz.Ledgers.api;

public enum TransactionStatus {
	COMPLETE("C"),
	PENDING("P"),
	VOID("V");
	
	public final String code;
	
	private TransactionStatus(String statusCode) {
		this.code = statusCode;
	}
}
