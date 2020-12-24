package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTests {
	
	@Test
	public void testSayHello() {
		assertEquals("Hello world!", new Greeter().sayHello());
	}
}
