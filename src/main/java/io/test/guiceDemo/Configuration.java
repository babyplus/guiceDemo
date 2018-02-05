package io.test.guiceDemo;

import io.test.guiceDemo.helloWorldDemo.HelloWorldPrinter;
import io.test.guiceDemo.helloWorldDemo.PrintStreamWriter;

public class Configuration {

	public static MyApplet getMainApplet() {
		// TODO Auto-generated method stub
		return new HelloWorldPrinter(new PrintStreamWriter(System.out));
	}

}
