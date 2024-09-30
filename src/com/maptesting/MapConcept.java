package com.maptesting;

import java.util.HashMap;

public class MapConcept {

	public static void main(String[] args) {
		
		
		// Collection : Key,value
		// HashMap (C)---> Map(I)
		
		// Hashmap is non order based collection. wont maintain order to store.
		
		// we can have only 1 null as key in hashmap
		// 1 null key allowed and multiple null values can be allowed
		
		
		HashMap<String , Integer> map = new HashMap<String,Integer> ();
		map.put("chrome", 101);
		map.put("Firrefox", 96);
		map.put("Edge", 103);
		
		
		HashMap<Integer , Integer> map1 = new HashMap<Integer,Integer> ();
         map1.put(100, 1);
         
         
         HashMap<String , Object> data = new HashMap<String , Object> ();
       
          data.put("Name","Surya");
          
          data.put("Age","36");
          data.put("Designation","QA");
          data.put("isPerm",true);
          data.put("gender",'m');
          data.put(null,"Test");
          data.put(null,"Test1");
          data.put("phone",null);
          data.put("city",null);
          data.put("Age","37");
          
          
          System.out.println(data.get(null));
          System.out.println(data);
         
          
          HashMap<String ,Integer> empMap = new HashMap<String , Integer> ();
          empMap.put("Tom", 20);
          empMap.put("Veena",30);
          empMap.put("sunil", 35);
          empMap.put("pradesh", 40);
          
                    
          
          
		
	}

}
