package org.nums;

public class Complex {
	// Code to be completed
	private int real;
	private int imaginary;
	
	public Complex(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
		System.out.println(real+" "+imaginary);
	}
	
	public Complex() {
		super();
	}

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
	public Complex add(Complex out){
		//Complex out=new Complex(real ,imaginary);
		/*System.out.println("add");
		System.out.println(out.real);
		System.out.println(out.imaginary);*/
		out.real=out.real+this.real;
		out.imaginary=out.imaginary+this.imaginary;
		/*System.out.println("add real "+out.real);
		System.out.println("add imagianry "+out.imaginary);*/
		return out ;
	}
	public Complex sub(Complex o2){
		//Complex o2=new Complex();
		/*System.out.println("sub");
		System.out.println(o2.real);
		System.out.println(o2.imaginary);*/
		o2.real=this.real-o2.real;
		o2.imaginary=this.imaginary-o2.imaginary;
		/*System.out.println("sub real "+o2.real);
		System.out.println("sub imagianry "+o2.imaginary);*/
		return o2;
	}

	@Override
	public String toString() {
		if(real==0&&imaginary==0)
			return 0+"";
		else if(real==0||imaginary==0){
			if(real==0)
				return this.imaginary+"j";
			if(imaginary==0)
				return this.real+"";
		}
		else if(real<0)
			return this.real+"+"+this.imaginary+"j";
		else if(imaginary<0)
			return this.real+"+"+this.imaginary+"j";
		else if(real>0&&imaginary>0)
			return this.real+"+"+this.imaginary+"j";
		return "";
	}
	
}
