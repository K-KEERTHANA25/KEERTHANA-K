package com.tnsif.exception;
//to demonstrate user-defined exceptions
public class Age extends Exception{
	Age(String str){        //create a constructor with parameter to provide error message
		System.out.println(str);
	}

}
