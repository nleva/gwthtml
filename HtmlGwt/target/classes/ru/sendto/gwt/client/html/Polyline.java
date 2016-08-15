package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Polyline extends WidgetBase {
	
	public Polyline() {
		WElement we = Svg.createElementSVG("polyline").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

}
