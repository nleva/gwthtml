package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Ellipse extends WidgetBase {
	
	public Ellipse() {
		WElement we = Svg.createElementSVG("ellipse").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

}
