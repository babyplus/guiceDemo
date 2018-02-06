package io.test.guiceDemo;

import io.test.guiceDemo.helloWorldDemo.StringWritingApplet;
import io.test.guiceDemo.helloWorldDemo.PrintStreamWriter;
import io.test.guiceDemo.helloWorldDemo.StringProvider;

public class Configuration {

	public static MyApplet getMainApplet() {
		// TODO Auto-generated method stub
		return new StringWritingApplet(new PrintStreamWriter(System.out), new StringProvider() {
			public String get() {
				return "HelloProvider";
			}
		});
	}

}
