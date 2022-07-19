package com.example;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Collecti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<>();
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			int key=i;
			String value=sc.next();
			hm.put(key,value);
		}
		
		System.out.println(hm);
		
		 // Iterating HashMap through for loop
        for (HashMap.Entry<Integer, String> set :
             hm.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set + " is "
                               + set.getValue());
		
		
}
	}}
