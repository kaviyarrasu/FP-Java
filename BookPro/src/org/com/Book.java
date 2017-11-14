package org.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book_details")
public class Book {
		@Id
		@GeneratedValue
		@Column(name="book_id",nullable=false)
		private int id;
		@Column(name="book_name",nullable=false,length=100,unique=true)
		private String name;
		@Column(name="book_type",nullable=false,length=100)
		private String type;
		@Column(name="book_description")
		private String description;
		@Column(name="book_stud_id")
		private int stuId;
		@Column(name="book_author",nullable=false)
		private String author;
		@Column(name="book_price")
		private String price;
		public Book(int id, String name, String type, String description, int stuId, String author, String price) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.description = description;
			this.stuId = stuId;
			this.author = author;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getStuId() {
			return stuId;
		}
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
}
