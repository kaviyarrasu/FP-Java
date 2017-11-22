package org.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SolutionItem {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int id, price;
		String name;
		while (true) {
			int ch;
			System.out.println("Enter the choice\n\t1.save\n\t2.total no.of.items");
			ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1:
				session.beginTransaction();
				System.out.println("Enter id");
				id = Integer.valueOf(bf.readLine());
				System.out.println("Enter name");
				name = bf.readLine();
				System.out.println("Enter price");
				price = Integer.valueOf(bf.readLine());
				Item it = new Item(id, name, price);
				session.save(it);
				session.getTransaction().commit();
				break;
			case 2:
				System.out.println("Total count of selected item "+Item.productcount);
				break;
			default:
				break;
			}
		}
		//session.close();
	}

}
