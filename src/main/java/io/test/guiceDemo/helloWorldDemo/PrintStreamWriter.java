package io.test.guiceDemo.helloWorldDemo;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination{

	private PrintStream destination;

	public PrintStreamWriter(PrintStream destination) {
		super();
		this.destination = destination;
	}

	@Override
	public void write(String string) {
		destination.print("hello world");
	}

}
