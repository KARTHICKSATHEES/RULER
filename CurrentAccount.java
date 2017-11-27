package acc.org.main;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends BankAccount {

	private double minimumAmountCanBeTransferred;
	private int minimumNoOfTransactions;
	private double amountTransferred;
	private int noOfTransactionsHeld;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(long accNo, String accHolder, String address, long phoneNo, String mailId, double balance) {
		super(accNo, accHolder, address, phoneNo, mailId, balance);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(long accNo, String accHolder, String address, long phoneNo, String mailId, double balance,
			double minimumAmountCanBeTransferred, int minimumNoOfTransactions, double amountTransferred,
			int noOfTransactionsHeld) {
		super(accNo, accHolder, address, phoneNo, mailId, balance);
		this.minimumAmountCanBeTransferred = minimumAmountCanBeTransferred;
		this.minimumNoOfTransactions = minimumNoOfTransactions;
		this.amountTransferred = amountTransferred;
		this.noOfTransactionsHeld = noOfTransactionsHeld;
	}

	public double getMinimumAmountCanBeTransferred() {
		return minimumAmountCanBeTransferred;
	}

	public void setMinimumAmountCanBeTransferred(double minimumAmountCanBeTransferred) {
		this.minimumAmountCanBeTransferred = minimumAmountCanBeTransferred;
	}

	public int getMinimumNoOfTransactions() {
		return minimumNoOfTransactions;
	}

	public void setMinimumNoOfTransactions(int minimumNoOfTransactions) {
		this.minimumNoOfTransactions = minimumNoOfTransactions;
	}

	public double getAmountTransferred() {
		return amountTransferred;
	}

	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}

	public int getNoOfTransactionsHeld() {
		return noOfTransactionsHeld;
	}

	public void setNoOfTransactionsHeld(int noOfTransactionsHeld) {
		this.noOfTransactionsHeld = noOfTransactionsHeld;
	}

	public boolean withDraw(double amount) {

		return true;
	}

	public boolean deposit(double amount) {

		return true;
	}

}
