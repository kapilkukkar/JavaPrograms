package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sychronisedList 
{

	public static void main(String[] args) 
	{
		List<Integer> numberList= Collections.synchronizedList(new ArrayList<Integer>());
		numberList.add(10);
		numberList.add(20);
		
		synchronized (numberList)  
		{
			Iterator<Integer> iterator= numberList.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			
		}

	}

}
