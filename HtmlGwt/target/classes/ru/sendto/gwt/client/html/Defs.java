package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Defs extends WidgetBase {
	
	public Defs() {
		WElement we = Svg.createElementSVG("defs").cast();
		setElement((Element)(we.cast()));
	}

}
