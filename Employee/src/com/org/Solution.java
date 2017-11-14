package com.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		int id,no=0;
		String name;
		String emailId;
		long phone;
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(no<4){
		session.beginTransaction();
		System.out.print("Enter the name : ");
		name = bf.readLine();
		System.out.print("Enter the email : ");
		 emailId = bf.readLine();
		System.out.print("Enter phone Number : ");
		phone = Long.valueOf(bf.readLine());
		Employee employee = new Employee(name, emailId, phone);
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getEmailId() + " "+ employee.getPhone() );
		session.save(employee);
		session.getTransaction().commit();
		no++;
		}
		session.close();
	}
}
