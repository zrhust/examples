package com.rzhang.examples;

public class Hello {

	public void sayHello(String msg) {
		if (msg.length() == 0) {
			msg = "World";
		}
		System.out.println("Hello " + msg + "\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		h.sayHello("Rong");
	}

}
