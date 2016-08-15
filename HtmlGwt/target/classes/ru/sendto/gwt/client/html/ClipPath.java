package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class ClipPath extends WidgetBase {
	
	public ClipPath() {
		WElement we = Svg.createElementSVG("clipPath").cast();
		setElement((Element)(we.cast()));
	}

}
