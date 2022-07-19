package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu>
{
	int rollno,mark;
	String name;
	public Stu(int rollno, int mark, String name) {
		super();
		this.rollno = rollno;
		this.mark = mark;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [rollno=" + rollno + ", mark=" + mark + ", name=" + name + "]";
	}	
		public int compareTo(Stu stud)
		{
			
			return name.charAt(0) >stud.name.charAt(0)?1:-1;
		
		}
	}

public class comp {

	public static void main(String[] args) {
		List<Stu> stud= new ArrayList<>();
		stud.add(new Stu(1,100,"logu"));
		stud.add(new Stu(2,197,"karthi"));
		stud.add(new Stu(4,200,"krithi"));
		stud.add(new Stu(8,70,"aadhil"));
     
		Collections.sort(stud);
		for (Object o:stud)
		{
			System.out.println(o);
		}
	}

}
