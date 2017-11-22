package org.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="item_details")
public class Item {
		static int productcount;
		static{
			productcount=0;
		}
		@Id
		@GeneratedValue
		@Column(name="item_id")
		private int id;
		@Column(name="item_name")
		private String name;
		@Column(name="item_qty")
		private int qty;
		/*public Item(){
			super();
			Item.productcount++;
		}*/
	
		public Item(int id, String name, int qty) {
			super();
			this.id = id;
			this.name = name;
			this.qty = qty;
			Item.productcount++;
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
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public static int getProductcount() {
			return productcount;
		}	
}
