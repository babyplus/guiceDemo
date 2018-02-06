package io.test.guiceDemo.helloWorldDemo;

import java.io.PrintStream;

import com.google.inject.AbstractModule;

import io.test.guiceDemo.MyApplet;

public class HelloWorldModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrintStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
		bind(String.class).toInstance("HelloBinding");
	}

}
