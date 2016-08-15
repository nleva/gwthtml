package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class ForeignObject extends WidgetBase {
	
	public ForeignObject() {
		WElement we = Svg.createElementSVG("foreignObject").cast();
		setElement((Element)(we.cast()));
	}

}
