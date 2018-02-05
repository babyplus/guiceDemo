package io.test.guiceDemo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MyApplet mainApplet = Configuration.getMainApplet();
		mainApplet.run();
	}

}
