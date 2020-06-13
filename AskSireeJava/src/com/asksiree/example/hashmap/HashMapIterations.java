package com.asksiree.example.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterations {

	public static void main(String[] args) {
		
		HashMapIterations obj = new HashMapIterations();
	
		Map<Integer, String> userMap = new HashMap<Integer, String>();
		userMap.put(1, "AskSiree User1");
		userMap.put(2, "AskSiree User2");
		userMap.put(3, "AskSiree User3");
		
		// 1. Using Java8 forEach()
		obj.iterateUsingJava8ForEach(userMap);
		
		// 2. Using Java8 Stream
		obj.iterateUsingJava8Stream(userMap);
		
		// 3. Using ForLoop And EntrySet
		obj.iterateUsingForLoopAndEntrySet(userMap);
		
		// 4. Using ForLoop And KeySet
		obj.iterateUsingForLoopAndKeySet(userMap);
		
		// 5. Using WhileLoop And EntrySet
		obj.iterateUsingWhileLoopAndEntrySet(userMap);
		
		// 6. Using WhileLoop And KeySet
		obj.iterateUsingWhileLoopAndKeySet(userMap);

	}
	
	public void iterateUsingJava8ForEach(Map<Integer, String> userMap){
		System.out.println("===================================");
		System.out.println("****** Using Java8 forEach() ******");
		System.out.println("===================================");
		userMap.forEach((id, userName) -> {
			System.out.println("Key is:" + id + " And Value is:" + userName);
		});
	}
	
	public void iterateUsingJava8Stream(Map<Integer, String> userMap){
		System.out.println("================================");
		System.out.println("****** Using Java8 Stream ******");
		System.out.println("================================");
		userMap.entrySet().stream().forEach(e -> 
			System.out.println("Key is:" + e.getKey() + " And Value is:" + e.getValue())
		);
	}
	
	public void iterateUsingForLoopAndEntrySet(Map<Integer, String> userMap){
		System.out.println("========================================");
		System.out.println("****** Using ForLoop And EntrySet ******");
		System.out.println("========================================");
		for(Map.Entry<Integer, String> entry: userMap.entrySet()) {
			System.out.println("Key is:" + entry.getKey() + " And Value is:" + entry.getValue());
		}
	}
	
	public void iterateUsingForLoopAndKeySet(Map<Integer, String> userMap){
		System.out.println("======================================");
		System.out.println("****** Using ForLoop And KeySet ******");
		System.out.println("======================================");
		for(Integer key: userMap.keySet()) {
			System.out.println("Key is:" + key + " And Value is:" + userMap.get(key));
		}
	}
	
	public void iterateUsingWhileLoopAndEntrySet(Map<Integer, String> userMap){
		System.out.println("==========================================");
		System.out.println("****** Using WhileLoop And EntrySet ******");
		System.out.println("==========================================");
		Iterator<Map.Entry<Integer, String>> iterator = userMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key is:" + entry.getKey() + " And Value is:" + entry.getValue());
		}
	}
	
	public void iterateUsingWhileLoopAndKeySet(Map<Integer, String> userMap){
		System.out.println("========================================");
		System.out.println("****** Using WhileLoop And KeySet ******");
		System.out.println("========================================");
		Iterator<Integer> iterator = userMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("Key is:" + key + " And Value is:" + userMap.get(key));
		}
		System.out.println("========================================");
	}

}
