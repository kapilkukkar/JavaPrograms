package InterviewPrograms;

public class compress_repeted_charcter_11 
{
	public static String compress_string(String input)
	{
		StringBuilder builder=new StringBuilder();
		int count =1;
		char[] ch= input.toCharArray();
		System.out.println(input.length());
		for(int i=1;i<input.length();i++)
		{
			if(ch[i]!=ch[i-1])
			{
				builder.append(ch[i-1]);
				builder.append(count);
				
				count=1;			
			}
			else
			{
				count++;
			}
		}
		builder.append(ch[input.length() - 1]);
        builder.append(count);		
		return builder.toString();		
	}
	

	public static void main(String[] args) 
	{
		String string="aaxxzzxrT";
		String compact_String=compress_string(string);
		System.out.println(compact_String);

	}

}
