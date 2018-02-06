package io.test.guiceDemo.helloWorldDemo;

import io.test.guiceDemo.MyApplet;

public class StringWritingApplet implements MyApplet {

	private MyDestination destination;
	private String string;

	public StringWritingApplet(MyDestination destination, String string) {
		super();
		this.destination = destination;
		this.string = string;
	}

	private void printString() {
		destination.write(string);
	}

	public void run() {
		// TODO Auto-generated method stub
		printString();
	}
}
