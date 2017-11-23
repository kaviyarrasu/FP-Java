package org.com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class Fourwheeler extends Vehicle {
		@Column
		private String streering;

		public Fourwheeler() {
			super();
		}

		public String getStreering() {
			return streering;
		}

		public void setStreering(String streering) {
			this.streering = streering;
		}
}
