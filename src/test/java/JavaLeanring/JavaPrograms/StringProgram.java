package JavaLeanring.JavaPrograms;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String plz:");
		String str= scanner.nextLine();
		String final_value="";
		String[] str2=str.split(" ");	
		for(String value:str2)
		{
			final_value = final_value+value.substring(0, 1).toUpperCase()+value.substring(1)+" ";
			
		}	
		System.out.println(final_value);
		
		
		scanner.close();

	}

}
