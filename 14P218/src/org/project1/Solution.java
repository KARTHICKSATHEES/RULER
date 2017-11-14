package org.project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String args[]) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		while (i < 3) {
			session.beginTransaction();
			Employee emp2 = new Employee();
			System.out.print("Enter Name :");
			String name = bf.readLine();
			emp2.setName(name);
			System.out.print("Enter Id :");
			int id = Integer.valueOf(bf.readLine());
			emp2.setId(id);
			System.out.print("Enter Email :");
			String email = bf.readLine();
			emp2.setEmail(email);
			System.out.print("Enter Phone :");
			long phone = Long.valueOf(bf.readLine());
			emp2.setPhone(phone);
			System.out.print("Enter BS :");
			int basicSalary = Integer.valueOf(bf.readLine());
			emp2.setBasicSalary(basicSalary);
			System.out.print("Enter DA :");
			int dearnessAllowance = Integer.valueOf(bf.readLine());
			emp2.setDearnessAllowance(dearnessAllowance);
			System.out.print("Enter HRA :");
			int houseRentAllowance = Integer.valueOf(bf.readLine());
			emp2.setHouseRentAllowance(houseRentAllowance);
			System.out.print("Enter TA :");
			int travelAllowance = Integer.valueOf(bf.readLine());
			emp2.setTravelAllowance(travelAllowance);

			session.save(emp2);
			session.getTransaction().commit();
			i++;
		}
		session.close();
	}
}
