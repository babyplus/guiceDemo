package io.test.guiceDemo.helloWorldDemo;

import java.io.PrintStream;

import io.test.guiceDemo.MyApplet;

public class HelloWorldPrinter implements MyApplet {

	private PrintStream destination;

	public HelloWorldPrinter(PrintStream destination) {
		super();
		this.destination = destination;
	}

	private void printHelloWorld() {
		destination = System.out;
		destination.println("Hello World!");
	}

	public void run() {
		// TODO Auto-generated method stub
		printHelloWorld();
	}
}
