package acc.org.main;

import javax.persistence.Entity;

@Entity
public class SavingsAccount extends BankAccount {
	private double maximumAmountCanBeTransferred;
	private int maximumNoOfTransactions;
	private double amountTransferred;
	private int noOfTransactionsHeld;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(long accNo, String accHolder, String address, long phoneNo, String mailId, double balance) {
		super(accNo, accHolder, address, phoneNo, mailId, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(long accNo, String accHolder, String address, long phoneNo, String mailId, double balance,
			double maximumAmountCanBeTransferred, int maximumNoOfTransactions, double amountTransferred,
			int noOfTransactionsHeld) {
		super(accNo, accHolder, address, phoneNo, mailId, balance);
		this.maximumAmountCanBeTransferred = maximumAmountCanBeTransferred;
		this.maximumNoOfTransactions = maximumNoOfTransactions;
		this.amountTransferred = amountTransferred;
		this.noOfTransactionsHeld = noOfTransactionsHeld;
	}

	public double getMaximumAmountCanBeTransferred() {
		return maximumAmountCanBeTransferred;
	}

	public void setMaximumAmountCanBeTransferred(double maximumAmountCanBeTransferred) {
		this.maximumAmountCanBeTransferred = maximumAmountCanBeTransferred;
	}

	public int getMaximumNoOfTransactions() {
		return maximumNoOfTransactions;
	}

	public void setMaximumNoOfTransactions(int maximumNoOfTransactions) {
		this.maximumNoOfTransactions = maximumNoOfTransactions;
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
