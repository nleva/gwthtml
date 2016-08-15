package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.OptionElement;
import com.google.gwt.user.client.DOM;

public class Option extends WidgetBase{
	public Option(String value) {
		WElement we = DOM.createOption().cast();
		//we.setWidget(this);
		setElement(we);
		setValue(value);
	}	
	public Option() {
		this("");
	}
	public void setValue(String value){
		getElement().setAttribute("value", value);
	}
	public String getValue(){
		return getElement().getAttribute("value");
	}	
	public void setDisabled(boolean b){
		((OptionElement)getElement().cast()).setDisabled(true);
	}
	public void setSelected(boolean b){
		((OptionElement)getElement().cast()).setSelected(true);
	}
	/*
	@Override
	public void setText(String text) {
		((OptionElement)getElement().cast()).setLabel(text);
	}
	*/
	
}