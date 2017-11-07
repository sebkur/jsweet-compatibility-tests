package de.topobyte;

import static def.dom.Globals.console;
import static def.dom.Globals.document;
import static def.dom.Globals.window;

import def.dom.Document;
import def.dom.Element;
import def.dom.HTMLElement;

public class Main
{

	public static void main(String[] args)
	{
		window.onload = e -> {
			return new Main();
		};
	}

	public Main()
	{
		console.info("constructor");
		Element body = document.getElementsByTagName("body").item(0);

		body.appendChild(document.createElement("br"));

		appendLine(body, "returnSomething: ", SomeUtil.returnSomething());
		appendLine(body, "returnMore: ", SomeUtil.returnMore());
	}

	private void appendLine(Element element, String first, String second)
	{
		Document document = element.ownerDocument;
		HTMLElement span1 = document.createElement("span");
		HTMLElement span2 = document.createElement("span");
		span1.textContent = first;
		span2.textContent = second;
		element.appendChild(span1);
		element.appendChild(span2);
		element.appendChild(document.createElement("br"));
	}

}
