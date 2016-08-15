package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.ImageElement;


public class Img extends WidgetBase {
	
	public Img() {
		super("img");
	}
	
	public ImageElement getImageElement() {
		return super.getElement().cast();
	}
	
	public void setSrc(String src) {
		getImageElement().setSrc(src);

	}

}
