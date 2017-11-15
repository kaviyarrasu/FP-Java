package org.isbn.bk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookSoution {

	public static void main(String[] args) throws IOException, Exception {
		int id,no=0;
		String isbnno;
		String name;
		String publisher;
		String author;
		String price;
		Date publish;
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(no<4){
		session.beginTransaction();
		System.out.println("Enter the No");
		no=Integer.valueOf(bf.readLine());
		System.out.println("Enter the isbnno");
		isbnno=bf.readLine();
		System.out.print("Enter the name : ");
		name = bf.readLine();
		System.out.print("Enter the publisher : ");
		publisher = bf.readLine();
		System.out.print("Enter author: ");
		author= bf.readLine();
		System.out.print("Enter Price: ");
		price= bf.readLine();
		System.out.print("Enter the published : ");
		publish = new Date(bf.readLine());
		Book bk=new Book(no,isbnno,name,publisher,author,price,publish);
		session.save(bk);
		session.getTransaction().commit();
		no++;
		}
		session.close();

	}

}
