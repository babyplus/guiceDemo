package io.test.guiceDemo;

import com.google.inject.Guice;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MyApplet mainApplet = 
				Guice.createInjector(new MainModule())
				.getInstance(MyApplet.class);
		mainApplet.run();
	}

}
