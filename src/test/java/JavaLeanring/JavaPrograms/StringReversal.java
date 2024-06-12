package JavaLeanring.JavaPrograms;

public class StringReversal 
{

	public static String reversal(String input)
	{
		String reversed="";		
		char[] ch =input.toCharArray();
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed += ch[i];
		}
		return reversed;
	}
	public static void main(String[] args)
	{
		System.out.println(reversal("This is a string"));
		

	}

}
