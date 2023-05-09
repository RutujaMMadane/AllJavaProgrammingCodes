package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;
@RunWith(MockitoJUnitRunner.class)
public class MainApplicationTestt {
	
		@InjectMocks 
		MainApplication mathApplication=new MainApplication();
		@Mock 
		CalculatorService calcService;
		@Test 
		public void testAdd()
		{
			when(calcService.add(10.0,20.0)).thenReturn(30.00);
			
			Assert.assertEquals(mathApplication.add(10.0,20.0),30.0,0);
		}
	

}
