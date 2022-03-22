package MockInterQns;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumAndStrings {

	public static void main(String[] args) {
		//method 1: using Random class
		
		Random ran=new Random();
		System.out.println(ran.nextInt(1000)); //limit 0 to 999
		
		System.out.println(ran.nextDouble());//limit 0.0 to 1.0
		
		//method 2: using Math class- this is static class
		
		System.out.println(Math.random());//by default it is double. not numeric
		
		//method 3: using Apache commons-land API to generate random num and string
		//download jar from http://commons.apache.org/
		
		System.out.println(RandomStringUtils.randomAlphabetic(5));
		System.out.println(RandomStringUtils.randomAlphanumeric(5));
		System.out.println(RandomStringUtils.randomNumeric(5));
		
		

	}

}
