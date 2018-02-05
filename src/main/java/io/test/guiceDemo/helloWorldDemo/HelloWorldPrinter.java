package io.test.guiceDemo.helloWorldDemo;

import io.test.guiceDemo.MyApplet;

public class HelloWorldPrinter implements MyApplet {

	private void printHelloWorld() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}

	public void run() {
		// TODO Auto-generated method stub
		printHelloWorld();
	}
}
