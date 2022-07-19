package com.example;

import org.springframework.stereotype.Component;

@Component
public class Gym {
	
	
	
	private int rollnum;
	private String name;
	private String bodytype;
	 int num1;
	 public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	int num2;
	 int result;
	

	public Gym() {
		super();
		System.out.println("object created for gymming world");
	}
	public Gym(int i, int j) {
		System.out.println(i+j+j);
		
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	public void Gyming() {
		System.out.println("happy gyming "+getRollnum());
		System.out.println("happy gyming "+getName());
		System.out.println("happy gyming "+getBodytype());
		System.out.println("happy gyming............. ");
		
	}
	
	public void add(int num1,int num2)
	{
		result=num1+num2;
		System.out.println(result);
	}
	public void sub(int num1,int num2)
	{
		result=num1-num2;
		System.out.println(result);
	}
	public void mul(int num1,int num2)
	{
		result=num1*num2;
		System.out.println(result);
	}
	public void div(int num1,int num2)
	{
		result=num1/num2;
		System.out.println(result);
	}
 

	
}
