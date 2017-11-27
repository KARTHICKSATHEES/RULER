package acc.org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		session.beginTransaction();
		
		System.out.print("Enter ACCOUNT NUMBER : ");
		long accNo=Long.valueOf(bf.readLine());
		System.out.print("Enter ACCOUNT HOLDER : ");
		String accHolder =bf.readLine();
		System.out.print("Enter ADDRESS : ");
		String address=bf.readLine();
		System.out.print("Enter PHONE NUMBER : ");
		long phoneNo=Long.valueOf(bf.readLine());
		System.out.print("Enter MAIL ID : ");
		String mailId=bf.readLine();
		System.out.print("Enter BALANCE : ");
		double balance=Double.valueOf(bf.readLine());
		
		BankAccount acc=new BankAccount(accNo, accHolder, address, phoneNo, mailId, balance);
		session.save(acc);
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
