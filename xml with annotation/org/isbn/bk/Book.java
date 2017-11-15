package org.isbn.bk;

import java.util.Date;

public class Book {
		private int id;
		private String isbnno;
		private String name;
		private String publisher;
		private String author;
		private String price;
		private Date published;
		public Book(int id, String isbnno, String name, String publisher, String author, String price,Date published) {
			super();
			this.id = id;
			this.isbnno = isbnno;
			this.name = name;
			this.publisher = publisher;
			this.author = author;
			this.price = price;
			this.published = published;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getIsbnno() {
			return isbnno;
		}
		public void setIsbnno(String isbnno) {
			this.isbnno = isbnno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
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
		public Date getPublished() {
			return published;
		}
		public void setPublished(Date published) {
			this.published = published;
		}
}
