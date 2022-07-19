package com.example.Interface;

import java.util.ArrayList;

public class InfaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Infa obj=new InfaClass();
//obj.display(2,3);
ArrayList< Integer> al= new ArrayList<>();
al.add(2);
al.add(4);
obj.display(al.get(0), al.get(1));

	}

}
