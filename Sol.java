package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sol {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		VechicleInfo ve = new VechicleInfo();
		ve.setName("CAR");

		TwoWheeler two = new TwoWheeler();
		two.setName("Bike");
		two.setSteeringHandle("Bike Handle");

		fourWheeler four = new fourWheeler();
		four.setName("Benz");
		four.setSteeringWheel("Benz Handle");

		/*
		 * System.out.println("Enter Two Wheeler Name : "); String name =
		 * bf.readLine(); System.out.println("Enter Two Wheeler ID : "); int
		 * vehicleId = Integer.valueOf(bf.readLine());
		 * 
		 * TwoWheeler two = new TwoWheeler(); two.setName(name);
		 * two.setVehicleId(vehicleId);
		 */

		session.beginTransaction();
		session.save(ve);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
