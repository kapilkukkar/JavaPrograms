package Array_Programs;

import java.util.regex.Pattern;

public class String_split {

	public static void main(String[] args) 
	{
		{
			String string = "Showing 1 to 10 of 20386 (203054 Pages)";

			// Split the string by parentheses and extract the number part
			String[] parts = string.split("\\("); // Split by '('
			if (parts.length >= 2) { // Check if there are at least two parts after splitting
				String numberPart = parts[1]; // Get the second part after splitting
				// Extract the number part before 'Pages' and trim any leading or trailing spaces
				System.out.println(numberPart);
				String pageNumber = numberPart.split(" ")[0].trim();
				System.out.println("Number of pages: " + pageNumber);
			} else {
				System.out.println("Number of pages not found.");
			}
		}
	}


}
