package JavaLeanring.JavaPrograms;

public class compressed_string 
{
	public static String compress_string(String input)
	{
		StringBuilder compressed= new StringBuilder();
		int count=1;
		char[] ch=input.toCharArray();
		for(int i=1;i<=input.length();i++)
		{
			if(i==input.length()||ch[i]!=ch[i-1])
			{
				compressed.append(ch[i-1]);
				compressed.append(count);
				count=1;
			}
			else
			{
			count++;	
			}
		}
		return compressed.toString();
		
	}

	public static void main(String[] args) 
	{
	String str= "aabbcccoooaaa";
	String compressed= compress_string(str);
	System.out.println("String was:" +str + "\n"+ "After Compression:"+compressed);

	}

}
