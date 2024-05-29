package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.iarcos.orange.demo.DummyApplication;

@SpringBootTest(classes = DummyApplication.class)
class DummyApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	void dummyLogger() {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
	}
	
	/*@Test
	void testZzero() {
		Integer result = crazyOperation(5);
		System.out.println(result);
	}

	private Integer crazyOperation(Integer num) {
		if (num == 0) {
			return 1;
		}
		if (num % 2 == 0) {
			return (num * crazyOperation(num - 1));
		} else {
			return (num * crazyOperation(num + 1));
		}
	}*/

}
