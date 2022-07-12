package Testing.HelloWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
	@Test
	public void testSayHello(){
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello world!", helloWorld.sayHello());
	}
}