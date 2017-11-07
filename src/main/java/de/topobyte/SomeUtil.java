package de.topobyte;

import java.util.Arrays;

public class SomeUtil
{

	public static void printSomething()
	{
		System.out.println("Hello JSweet");
	}

	public static String returnSomething()
	{
		return "Hello JSweet";
	}

	public static void sortSomething()
	{
		String[] someStrings = new String[] { "b", "c", "a" };
		Arrays.sort(someStrings);
	}

}
