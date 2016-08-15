package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;


public class Button extends WidgetBase {
	
	Element text;
	
	public Button() {
		/*super("div");
		text=DOM.createDiv();
		WElement.wrap(this, (WElement) text.cast());
		getElement().appendChild(text);
		addStyleName("button");*/
		super("button");
	}
	
	@Override
	public void setText(String s) {
		text.setInnerText(s);
	}
	
	@Override
	public String getText() {
		return text.getInnerText();
	}

	public void setType(String type){
		getElement().setAttribute("type", type);
	}
	public String getType(){
		return getElement().getAttribute("type");
	}
	
	public void setValue(String type){
		getElement().setAttribute("value", type);
	}
	public String getValue(){
		return getElement().getAttribute("value");
	}
	
	public void setAttrs(String attrs){
		String[] pairs=attrs.split(";");
		for (String pair : pairs) {
			String[] attr = pair.split(":");
			if(attr.length==2)
				getElement().setAttribute(attr[0], attr[1]);
			else if(attr.length==1)
				getElement().setAttribute(attr[0], "");
		}
	}
	
}
