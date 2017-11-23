package org.com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cycle")
public class Twowheeler extends Vehicle {
		@Column
		private String handler;

		public Twowheeler() {
			super();
		}

		public String getHandler() {
			return handler;
		}

		public void setHandler(String handler) {
			this.handler = handler;
		}
}
