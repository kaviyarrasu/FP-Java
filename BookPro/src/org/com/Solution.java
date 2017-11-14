package org.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		int id=0, stuid, reader = 0;
		String name, type, desc, author, price;

		while (reader < 4) {
			session.beginTransaction();
			//System.out.println("Enter the book id");
			//id = Integer.valueOf(bf.readLine());
			System.out.println("Enter the book name");
			name = bf.readLine();
			System.out.println("Enter the book type");
			type = bf.readLine();
			System.out.println("Enter the book description");
			desc = bf.readLine();
			System.out.println("Enter the book student_id");
			stuid = Integer.valueOf(bf.readLine());
			System.out.println("Enter the book author");
			author = bf.readLine();
			System.out.println("Enter the book price");
			price = bf.readLine();
			Book book=new Book(id, name, type, desc, stuid, author,price);
			session.save(book);
			session.getTransaction().commit();
			reader++;
		}
		session.close();
	}

}
