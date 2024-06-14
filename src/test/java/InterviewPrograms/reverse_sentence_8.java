package InterviewPrograms;

public class reverse_sentence_8 
{
	public static String reversed(String input)
	{
		String reverse_string="";
		char[] ch= input.toCharArray();
		for(int i=input.length()-1;i>=0;i--)
		{
			reverse_string+=ch[i];
		}
		return reverse_string;
		
	}

	public static void main(String[] args) 
	{
		String str= "how you doing";
		String reversedString=reversed(str);
		System.out.println(reversedString);

	}

}
