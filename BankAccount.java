package acc.org.main;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_DETAILS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BANK_TYPE", discriminatorType = DiscriminatorType.STRING)

public class BankAccount {
	@Id
	private long accNo;
	private String accHolder;
	private String address;
	private long phoneNo;
	private String mailId;
	protected double balance;

	public boolean withDraw(double amount) {

		return true;
	}

	public boolean deposit(double amount) {

		return true;
	}

	public BankAccount(long accNo, String accHolder, String address, long phoneNo, String mailId, double balance) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		this.address = address;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
		this.balance = balance;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
