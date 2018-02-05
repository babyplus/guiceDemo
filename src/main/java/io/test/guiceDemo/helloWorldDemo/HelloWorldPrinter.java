package io.test.guiceDemo.helloWorldDemo;


import io.test.guiceDemo.MyApplet;

public class HelloWorldPrinter implements MyApplet {

	private MyDestination destination;

	public HelloWorldPrinter(MyDestination destination) {
		super();
		this.destination = destination;
	}

	private void printHelloWorld() {
		destination.write("Hello World!");
	}

	public void run() {
		// TODO Auto-generated method stub
		printHelloWorld();
	}
}
