package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Path extends WidgetBase {
	
	public Path() {
		WElement we = Svg.createElementSVG("path").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

}
