package io.test.guiceDemo.helloWorldDemo;

import io.test.guiceDemo.MyApplet;

public class StringWritingApplet implements MyApplet {

	private MyDestination destination;
	private StringProvider stringProvider;

	public StringWritingApplet(MyDestination destination, StringProvider stringProvider) {
		super();
		this.destination = destination;
		this.stringProvider = stringProvider;
	}

	private void printString() {
		destination.write(stringProvider.get());
	}

	public void run() {
		// TODO Auto-generated method stub
		printString();
	}
}
