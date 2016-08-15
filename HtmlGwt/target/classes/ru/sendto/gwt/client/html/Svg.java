package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Svg extends WidgetBase {
	
	
	public static native Element createElementSVG( 
	        final String tag)/*-{
	    return document.createElementNS("http://www.w3.org/2000/svg", tag);
	}-*/;
	
	public Svg() {
		WElement we = createElementSVG("svg").cast();
		//we.setWidget(this);
		setElement((Element)(we.cast()));
	}

	public void setViewBox(String value){
		getElement().setAttribute("viewBox", value);
	}

}
