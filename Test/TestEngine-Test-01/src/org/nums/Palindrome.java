package org.nums;

import java.util.Arrays;

public class Palindrome {
	public static int getMax(int ...numbers) {
		
		int i,n1,n2,len=numbers.length,sum;
		String num,temp;
		if(len>0){
		for(i=0;i<len;i++){
			sum=0;
			n1=numbers[i];
			num=String.valueOf(numbers[i]);
			//System.out.println(num);
			StringBuffer sb=new StringBuffer(new String(num));
			String s1=new String(sb.reverse());
			if(!num.equals(s1)){
			while(!num.equals(s1)){
					n2=Integer.valueOf(s1);
				 	//System.out.println("n1  "+n1);
				 	//System.out.println("n2  "+n2);
					sum=sum+n2+n1;
					//System.out.println("sum  "+sum);
					num=String.valueOf(sum);
					StringBuffer q=new StringBuffer(new String(num));
					s1=new String(q.reverse());
					n1=sum;
					//System.out.println("new "+num);
					//System.out.println("revnew "+s1);
			}
			numbers[i]=sum;
			//System.out.println("number[i]  "+numbers[i]);
		}
		}
		Arrays.sort(numbers);
		if(numbers[len-1]!=0){
			return numbers[len-1];
			}
		else
			return -1;
		}
		else
			return -1;
	}
}
