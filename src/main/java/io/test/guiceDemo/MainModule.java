package io.test.guiceDemo;

import java.io.PrintStream;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;

import io.test.guiceDemo.helloWorldDemo.MyDestination;
import io.test.guiceDemo.helloWorldDemo.PrintStreamWriter;
import io.test.guiceDemo.helloWorldDemo.StringWritingApplet;

public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrintStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
		bind(String.class).toProvider(new Provider<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Hello Provider";
			}

		});
	}
}
