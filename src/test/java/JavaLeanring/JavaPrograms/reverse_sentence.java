package JavaLeanring.JavaPrograms;

public class reverse_sentence
{
	public static String reversed(String input)
	{
		String[] str=input.split("");
		String reverse_string="";
		for(int i= str.length-1;i>=0;i--)
		{
			reverse_string+=str[i];
		}
		return reverse_string; 
	}

	public static void main(String[] args) 
	{
		String str="hello how are you mom";
		String reversalString= reversed(str);
		System.out.println(reversalString);

	}

}
