package io.test.guiceDemo;

import io.test.guiceDemo.helloWorldDemo.HelloWorldPrinter;

public class Configuration {

	public static HelloWorldPrinter getMainApplet() {
		// TODO Auto-generated method stub
		return new HelloWorldPrinter();
	}

}
