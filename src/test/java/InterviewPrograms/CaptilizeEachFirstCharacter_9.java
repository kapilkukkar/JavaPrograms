package InterviewPrograms;

public class CaptilizeEachFirstCharacter_9 
{
	public static String capital_first_char(String input)
	{
		String[] strings=input.split(" ");
		String x="";
		for(String value: strings)
		{
			x+=value.substring(0, 1).toUpperCase()+value.substring(1)+ " ";
		}
		return x;
		
	}
	public static void main(String[] args) 
	{
		String string="how you doing";
		String new_String= capital_first_char(string);
		System.out.println(new_String);

	}

}
