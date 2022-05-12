package com.demo;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingDemoAppApplicationTests {
	private Calculator c = new Calculator();
	@Test
	void contextLoads() {
		
		
		
	}
	@Test
	void testSum() 
	{
		// expected result
	 int expectedResult = 87;
		// actual	
	int actualResult = c.doSum(12, 32, 43); 
	
	assertThat(actualResult).isEqualTo(expectedResult);
	// if both are same then we will pass the test case
		
	}
	
	@Test 
	void testProduct() {
		int actualResult = c.doProduct(2, 11);
		
		int expectedResult = 22;
		assertThat(actualResult).isEqualTo(expectedResult);
				
		
	}

}
