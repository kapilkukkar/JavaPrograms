package Array_Programs;

import java.time.Month;

public class compareString {

	public static void main(String[] args) 
	{
		String str1 = "May";
		String str2="March";		
		Month monthenum= Month.valueOf(str1.toUpperCase());
		
		Month monthenum2 = Month.valueOf(str2.toUpperCase());
		int comarision= monthenum.compareTo(monthenum2);
		if(comarision==0)
		{
			System.out.println("Same Month");
		}
		else if (comarision<0)
		{
			System.out.println("Go UP");
		}
		else 
		{
			System.out.println("GO Down");
		}
		
	    

	}
	

}
