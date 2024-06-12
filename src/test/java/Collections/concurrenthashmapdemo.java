package Collections;

import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmapdemo {

	public static void main(String[] args) 
	{
		ConcurrentHashMap<String , String> concurrentmap= new ConcurrentHashMap<String, String>();
		concurrentmap.put("kapil", "kukkar");
		concurrentmap.put(null, "sahab");
		concurrentmap.put("sahab",null);//here we are trying to enter the key and value is  null and it is giving null pointer exception. 
		System.out.println(concurrentmap.get("kapil"));		

	}

}
