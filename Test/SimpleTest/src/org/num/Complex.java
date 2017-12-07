package org.num;

public class Complex {
		public Complex add(int real,int imaginary){
			Complex out = new Complex();
			out.setReal(real+this.real);
			out.setImaginary(imaginary+this.imaginary);
			return out;
		}
		private int real,imaginary;

		public int getReal() {
			return real;
		}

		public void setReal(int real) {
			this.real = real;
		}

		public int getImaginary() {
			return imaginary;
		}

		public void setImaginary(int imaginary) {
			this.imaginary = imaginary;
		}
		
}
