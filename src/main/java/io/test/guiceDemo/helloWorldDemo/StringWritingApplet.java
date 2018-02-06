package io.test.guiceDemo.helloWorldDemo;

import javax.inject.Inject;

import com.google.inject.Provider;

import io.test.guiceDemo.MyApplet;

public class StringWritingApplet implements MyApplet {

	private MyDestination destination;
	private Provider<String> stringProvider;
 
	@Inject
	public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
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
