package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Rect extends WidgetBase {
	
	public Rect() {
		WElement we = Svg.createElementSVG("rect").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

}
