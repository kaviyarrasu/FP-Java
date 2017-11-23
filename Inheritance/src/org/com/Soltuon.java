package org.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Soltuon {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		session.beginTransaction();
		Vehicle ve=new Vehicle();
		ve.setId(1);
		ve.setName("base");
		Twowheeler two=new Twowheeler();
		two.setId(1);
		two.setName("d1");
		Fourwheeler four=new Fourwheeler();
		four.setId(1);
		four.setName("d2");
		session.save(ve);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();
	}

}
