package com.tnsif.comparator;

import java.util.Comparator;

public class SortbyRollno implements Comparator<Student> {

	@Override
	public int compare(Student a1, Student a2) {
		
		return a2.rollno-a1.rollno;
	}

}
