package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;


public class Circle extends WidgetBase {
	
	double r;
	String styleTemplate="";
	
	public Circle() {
		WElement we = Svg.createElementSVG("circle").cast();
		setElement((Element)(we.cast()));
	}

	public void setCx(String s){
		getElement().setAttribute("cx", s);
	}
	public void setCy(String s){
		getElement().setAttribute("cy", s);
	}

	public void setR(String s){
		getElement().setAttribute("r", s);
		r=Double.parseDouble(s.replaceAll("[^0-9.]", ""));
	}
	public double getR(){
		return r;
	}
	public double getLineLength(){
		return r*2*Math.PI;
	}
	/* (non-Javadoc)
	 * @see ru.sendto.gwt.client.html.WidgetBase#setClass(java.lang.String)
	 */
	@Override
	public void setClass(String name) {
		getElement().setAttribute("class", name);
	}
	
	public String getStyleTemplate() {
		return styleTemplate;
	}
	public void setStyleTemplate(String styleTemplate) {
		this.styleTemplate = styleTemplate;
	}
	public void setStyleWithTemplate(String regexp, String...args){
		String style=styleTemplate;
		for (String arg : args) {
			style=style.replaceFirst(regexp, arg);
		}

		setAttribute("style", style);
	}
	

}
