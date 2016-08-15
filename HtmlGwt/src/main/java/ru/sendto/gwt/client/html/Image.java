package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Image extends WidgetBase {
	
	public Image() {
		WElement we = Svg.createElementSVG("image").cast();
		setElement((Element)(we.cast()));
	}

	/**
	 * Задаёт значение xlink:href.
	 * @param href - значение xlink:href.
	 */
	public void setHref(String href) {
		getElement().setAttributeNS("http://www.w3.org/1999/xlink", "xlink:href", href);
	}
	
	
	/**
	 * Возвращает значение xlink:href.
	 * @return возвращает значение xlink:href.
	 */
	public String getHref() {
		return getElement().getAttribute("xlink:href");
	}
}
