package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class G extends WidgetBase {
	
	public G() {
		WElement we = Svg.createElementSVG("g").cast();
		setElement((Element)(we.cast()));
	}

}
