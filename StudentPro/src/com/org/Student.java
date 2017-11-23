package com.org;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
		@Id
		@GeneratedValue
		@Column(name="std_id",unique=true)
		private int rollno;
		@Column(name="std_name")
		private String name;
		@Column(name="std_year")
		private int year;
		@Column(name="std_semester")
		private int semester;
		@Column(name="std_dpt")
		private String dept;
		static int stdcount;
		static{
			stdcount=0;
		}
		public Student(){
			super();
		}
		public Student(int rollno, String name, int year, int semester, String dept) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.year = year;
			this.semester = semester;
			this.dept = dept;
			Student.stdcount++;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getSemester() {
			return semester;
		}
		public void setSemester(int semester) {
			this.semester = semester;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
}
