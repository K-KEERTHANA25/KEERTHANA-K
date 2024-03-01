package com.tnsif.finaljava;

public class Finalvariable {
final int x=8;
final static int y;
static void change() {

}
static {
	y=70;
}
public static void main(String[] args) {
	Finalvariable.change();
	System.out.println("value of y"+y);
}
}


