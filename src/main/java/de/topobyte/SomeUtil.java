package de.topobyte;

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

	public static String returnMore()
	{
		StringBuilder buffer = new StringBuilder();
		buffer.append(1);
		buffer.append(" asdf ");
		buffer.append(1.5);
		buffer.append(" asdf ");
		buffer.append(true);
		return buffer.toString();
	}

}
