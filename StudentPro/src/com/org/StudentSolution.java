package com.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentSolution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int rollno,no=0;
		String name,n1;
		int year,y1;
		int semester,s1;
		String dept,d1;
		System.out.println("Inserting the values in database");
		while(no<1){
			session.beginTransaction();
			System.out.println("Enter Student rollno");
			rollno=Integer.valueOf(bf.readLine());
			System.out.println("Enter Student name");
			name=bf.readLine();
			System.out.println("Enter Student year");
			year=Integer.valueOf(bf.readLine());
			System.out.println("Enter Student semester");
			semester=Integer.valueOf(bf.readLine());
			System.out.println("Enter Student Department");
			dept=bf.readLine();
			Student st=new Student(rollno, name, year, semester, dept);
			session.save(st);
			session.getTransaction().commit();
			no++;
		}
		
		System.out.println("Total count of the Student is "+Student.stdcount);
		
		System.out.println("Updating the values in database");
		Student std=session.get(Student.class,1);
		session.beginTransaction();
		System.out.println("Enter Student name");
		n1=bf.readLine();
		System.out.println("Enter Student year");
		y1=Integer.valueOf(bf.readLine());
		System.out.println("Enter Student semester");
		s1=Integer.valueOf(bf.readLine());
		System.out.println("Enter Student Department");
		d1=bf.readLine();
		std.setName(n1);
		std.setYear(y1);
		std.setSemester(s1);
		std.setDept(d1);
		session.update(std);
		session.getTransaction().commit();
		System.out.println("The Values is updated");
		
		System.out.println("Deleting the values in database");
		session.beginTransaction();
		Student stu=session.get(Student.class,2);
		session.delete(stu);
		session.getTransaction().commit();
		System.out.println("Deleted");
		session.close();
	}

}
