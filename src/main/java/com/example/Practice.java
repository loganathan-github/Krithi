package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList<>();
		al.add(1);
		al.add(1, 3);
		al.add("dad");
		if(!al.contains(3))
		{
			System.out.println("nooooooooo");
		}
		
		System.out.println(al);
		StringBuffer sb = new StringBuffer();
		String my_pass=  (String) al.get(2);
		sb=sb.append(my_pass);
		
		System.out.println(sb.append(" mom"));
		
		Gym g1= new Gym(0,18);
		Gym g=new Gym();
		g.setName("logu");
		g.setBodytype("aesthetic");
		g.setRollnum(100);
//		System.out.println(g.getBodytype()+" "+g.getName()+" "+g.getRollnum());
//		g.Gyming();
		g.setName("LOGAN");
		g.setBodytype("FAT");
		g.setRollnum(200);
		System.out.println(g.getBodytype()+" "+g.getName()+" "+g.getRollnum());
		g.Gyming();
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	g.add(a,b);
		g.sub(a,b);
		g.div(a,b);
		g.mul(a,b);
		System.out.println(g.toString());
		
	}

}
