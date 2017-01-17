package ru.sendto.gwt.client.html;

import elemental.events.EventListener;
import elemental.events.EventRemover;

public class WElement extends com.google.gwt.user.client.Element {
	
//	WidgetBase base;
	
	protected WElement() {
	}
	
	public static native void setWidgetBase(WidgetBase base, WElement el) /*-{
		el.__wb = base;
	}-*/;

	
	public static native WidgetBase getWidgetBase(WElement el) /*-{
		return el.__wb;
	}-*/;

	public final void setWidgetBase(WidgetBase base){
		setWidgetBase(base, this);
	}

	public final WidgetBase getWidgetBase(){
		return getWidgetBase(this);
	}
	
	public native final EventRemover addEventListener(String type, EventListener listener, boolean useCapture)/*-{
		return this.addEventListener(type, listener.@elemental.events.EventListener::handleEvent(Lelemental/events/Event;), useCapture);
	}-*/;

	public native final EventRemover addEventListener(String type, EventListener listener)/*-{
		return this.addEventListener(type, listener.@elemental.events.EventListener::handleEvent(Lelemental/events/Event;));
	}-*/;

	
	  /**
	   * Generators a native dom click on the element.
	   */
	  public final native void click() /*-{
	    var dom = this;
	    if (dom.click) {
	        dom.click();
	    } else {
	        var event = $doc.createEvent("MouseEvents");
	        event.initEvent('click', true, true, $wnd, 0, 0, 0, 0, 0, false,
	                false, false, false, 1, dom);
	        dom.dispatchEvent(event);
	    }
	  }-*/;
	  /**
	   * Sets the attribute, determined by it names, using the given name space and value.
	   * 
	   * @param nameSpace the name space of the attribute
	   * @param name the attribute name
	   * @param value the value of the attribute
	   */
	  public final native void setAttributeNS(String nameSpace, String name, String value)/*-{
	    this.setAttributeNS(nameSpace, name, value);
	  }-*/;
	  
	  
}
