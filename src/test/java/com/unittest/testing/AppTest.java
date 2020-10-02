package com.unittest.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrenheit object;
	@Before
	public void newClassfahrenheit() {
		object = new Fahrenheit();
	}
	@Test
	public void testResult0input0() {
		double input = 0;
		double expected =0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult0inputCalcutate0() {
		double input = 0;
		double expected =32;
		object.input(input);
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1input1() {
		double input = 1;
		double expected =1;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus1tinputMinus1() {
		double input = -1;
		double expected =-1;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult1000input1000() {
		double input = 1000;
		double expected =1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1000inpuCaculatet1000() {
		double input = 1000;
		double expected =1832;
		object.input(input);
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus1000tinputMinusCalculate1000() {
		double input = -1000;
		double expected =-1768;
		object.input(input);
		double actual = object.getFahrenheit();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResulminus1000tinputMinus1000() {
		double input = -1000;
		double expected =-1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResult2000input2000() {
		double input = 2000;
		double expected =2000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	
	@Test
	public void testResulminus2000tinputMinus2000() {
		double input = -2000;
		double expected =-2000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus1010tinputMinus1010() {
		double input = -1010;
		double expected =-1010;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1010input1010() {
		double input = 1010;
		double expected =1010;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus1001tinputMinus1001() {
		double input = -1001;
		double expected =-1001;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult1001input1001() {
		double input = 1001;
		double expected =1001;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus999tinputMinus999() {
		double input = -999;
		double expected =-999;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult999input999() {
		double input = 999;
		double expected =999;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus501tinputMinus501() {
		double input = -501;
		double expected =-501;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult501input501() {
		double input = 501;
		double expected =501;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus500tinputMinus500() {
		double input = -500;
		double expected =-500;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult500input500() {
		double input = 500;
		double expected =500;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResulminus499tinputMinus499() {
		double input = -499;
		double expected =-499;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResult499input499() {
		double input = 499;
		double expected =499;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual,2);
	}
	@Test
	public void testResultTrueinput0() {
		double input = 0;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1() {
		double input = 1;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus() {
		double input = -1;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput501() {
		double input = 501;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus501() {
		double input = -501;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput500() {
		double input = 500;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus500() {
		double input = -500;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput499() {
		double input = 499;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus499() {
		double input = -499;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueinput999() {
		double input = 999;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus999() {
		double input = -999;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultTrueinput1000() {
		double input = 1000;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus1000() {
		double input = -1000;
		boolean expected = true;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseinputMinus1001() {
		double input = -1001;
		boolean expected = false;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseinput1001() {
		double input = 1001;
		boolean expected = false;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFaseinput1010() {
		double input = 1010;
		boolean expected = false;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultfalseinputMinus1010() {
		double input = -1010;
		boolean expected = false;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultFalseinput2000() {
		double input = 2000;
		boolean expected = false;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseinputMinus2000() {
		double input = -2000;
		boolean expected = false;
		object.input(input);
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultMessageOutputFromInput0() {
		double input = 0;
		String expected = "0 celcius = 32 fahrenheit";
		object.input(input);
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	@Test
	public void testResultMessageOutputFromInput1000() {
		double input = 1000;
		String expected = "1000 celcius = 1832 fahrenheit";
		object.input(input);
		String actual = object.toString();
		assertEquals(expected,actual);
	}
	@Test
	public void testResultMessageOutputFromInputMinus1000() {
		double input = -1000;
		String expected = "-1000 celcius = -1768 fahrenheit";
		object.input(input);
		String actual = object.toString();
		assertEquals(expected,actual);
	}
}