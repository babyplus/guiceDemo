package io.test.guiceDemo.helloWorldDemo;

import java.io.PrintStream;

import javax.inject.Inject;

public class PrintStreamWriter implements MyDestination{

	private PrintStream destination;

	@Inject
	public PrintStreamWriter(PrintStream destination) {
		super();
		this.destination = destination;
	}

	@Override
	public void write(String string) {
		destination.print(string);
	}

}
