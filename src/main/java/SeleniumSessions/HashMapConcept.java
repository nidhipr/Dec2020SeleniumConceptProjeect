package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		//Hashmap store value in key,value format
		//it implement map
		Map<String, Object> m1 = new HashMap<String, Object>();
		m1.put("name", "nidhi");
		m1.put("address", "ranchi");
		m1.put("age", 34);
		m1.put("name", "priya");
		m1.put("name", "priya");
		m1.put("name", "priya");
		
		System.out.println(m1.get("name"));
		System.out.println(m1.get("address"));
		System.out.println(m1.get("age"));
		System.out.println(m1.get("city"));
		
		

	}

}
