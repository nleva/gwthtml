package ru.sendto.gwt.client.html;


public class Anchor extends WidgetBase {
	
	public Anchor() {
		super("a");
	}

	public void setHref(String ref) {
		getElement().setAttribute("href", ref);

	}
	public String getHref() {
		return getElement().getAttribute("href");
	}

}
