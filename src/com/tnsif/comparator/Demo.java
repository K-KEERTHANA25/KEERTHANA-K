package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(new Student(25,"bbb","london"));
		s.add(new Student(21,"ccc","India"));
		s.add(new Student(23,"aaa","nepal"));
		
		//System.out.println(s);
		
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		Collections.sort(s.new SortbyRollno());
		Collections.sort(s.new SortbyName());
		
		for(int i=0;i<s.size();i++)
	}

}
