package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Line extends WidgetBase {
	
	public Line() {
		WElement we = Svg.createElementSVG("line").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

}
