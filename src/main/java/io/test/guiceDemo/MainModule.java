package io.test.guiceDemo;

import com.google.inject.AbstractModule;

import io.test.guiceDemo.helloWorldDemo.HelloWorldModule;

public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		install(new HelloWorldModule());
	}
}
