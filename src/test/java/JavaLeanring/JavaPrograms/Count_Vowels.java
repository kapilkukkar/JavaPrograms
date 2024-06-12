package JavaLeanring.JavaPrograms;

public class Count_Vowels {

	public static void main(String[] args) 
	{
		String alphabets="fhidfhsdhafhflhfodhfohvcnvjndsjfoifoaeiou";
		
		int characterString= alphabets.length()-(alphabets.replaceAll("[aeiou]", "").length());
		System.out.println(characterString);

	}

}

