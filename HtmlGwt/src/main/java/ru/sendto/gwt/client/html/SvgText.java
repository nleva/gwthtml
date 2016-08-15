package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class SvgText extends WidgetBase {
	
	public SvgText() {
		WElement we = Svg.createElementSVG("text").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

}
