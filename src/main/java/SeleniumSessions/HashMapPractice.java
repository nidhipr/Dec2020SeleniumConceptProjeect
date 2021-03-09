package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		//collection-dynamic
		//K-V	
		
		Map<String,String> empMap = new HashMap<String,String>();
		empMap.put("name","rohan");
		empMap.put("age","20");
		empMap.put("address","ranchi");
		empMap.put("gender","male");
		empMap.put("country","India");
		empMap.put(null,"60");
		empMap.put(null,"70");
		empMap.put("city",null);
		empMap.put("name",null);
		
		System.out.println(empMap.get("country"));
		System.out.println(empMap.get("city"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("name"));
		
		//to fetch all key value-entrySet
		for(Map.Entry<String, String> entry: empMap.entrySet() ) {
			System.out.println("Key = " +entry.getKey() + "Value = "+entry.getValue());
		}

	}

}
