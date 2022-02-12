package com.rommelosc.codewars.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;		

/**
  You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
  The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. 
  Write a method that takes the array as an argument and returns this "outlier" N.

  Examples
	
	[2, 4, 0, 100, 4, 11, 2602, 36]
	Should return: 11 (the only odd number)
	
	[160, 3, 1719, 19, 11, 13, -21]
	Should return: 160 (the only even number)
	
 * */
public class FindOutlier {

	static int find(int[] integers) {
		
		List<Integer> evenNumbers = Arrays.stream(integers).filter(n -> n%2 == 0).boxed().collect(Collectors.toList());
		List<Integer> oddNumbers = Arrays.stream(integers).filter(n -> n%2 != 0).boxed().collect(Collectors.toList());
				
		return evenNumbers.size() > oddNumbers.size() ? oddNumbers.get(0) : evenNumbers.get(0);
	}

	public static void main(String[] args) {
		
		int []  testOne = {2, 4, 0, 100, 4, 11, 2602, 36}; 
		int []  testTwo = {160, 3, 1719, 19, 11, 13, -21}; 
		
		int testOneOutlier = find(testOne);
		System.out.println("Test one outlier: " + testOneOutlier);
		
		int testTwoOutlier = find(testTwo);
		System.out.println("Test two outlier: " + testTwoOutlier);
		
	}

}
