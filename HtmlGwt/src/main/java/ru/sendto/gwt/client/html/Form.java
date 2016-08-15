package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

public class Form extends WidgetBase {

	public Form() {
		Element el;
		setElement(el=DOM.createForm());
	}

}
