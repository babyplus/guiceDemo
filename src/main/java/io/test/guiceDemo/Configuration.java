package io.test.guiceDemo;

import io.test.guiceDemo.helloWorldDemo.HelloWorldPrinter;

public class Configuration {

	public static MyApplet getMainApplet() {
		// TODO Auto-generated method stub
		return new HelloWorldPrinter();
	}

}
