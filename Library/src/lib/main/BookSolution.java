package lib.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookSolution {
	public static void main(String args[]) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		while (i < 2) {

			session.beginTransaction();
			Book obj = new Book();
			System.out.println("Enter isbnNo");
			long isbnNo = Long.valueOf(b.readLine());
			System.out.println("Enter authorName");
			String authorName = b.readLine();
			obj.setAuthorName(authorName);
			System.out.println("Enter bookId");
			int bookId = Integer.valueOf(b.readLine());
			obj.setBookId(bookId);
			System.out.println("Enter publication");
			String publication = b.readLine();
			obj.setPublication(publication);
			System.out.println("Enter edition");
			int edition = Integer.valueOf(b.readLine());
			obj.setEdition(edition);

			session.save(obj);
			session.getTransaction().commit();

			i++;
		}
		session.close();
	}
}
