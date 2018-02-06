package io.test.guiceDemo.helloWorldDemo;

import io.test.guiceDemo.MyApplet;

public class HelloWorldPrinter implements MyApplet {

	private MyDestination destination;
	private String string;

	public HelloWorldPrinter(MyDestination destination, String string) {
		super();
		this.destination = destination;
		this.string = string;
	}

	private void printHelloWorld() {
		destination.write(string);
	}

	public void run() {
		// TODO Auto-generated method stub
		printHelloWorld();
	}
}
