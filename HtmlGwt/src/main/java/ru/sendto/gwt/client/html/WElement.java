package ru.sendto.gwt.client.html;

import elemental.events.Event;
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
	
//	static class Handler{
//		EventListener listener;
//		public Handler(EventListener listener) {
//			this.listener=listener;
//		}
//		void exec(Event e){
//			listener.handleEvent(null);
//		}
//	}
//	public static Handler toHandler(EventListener listener){
//		return new Handler(listener);
//	}
	

	static void handleEvent(Event event, EventListener listener){
		listener.handleEvent(event);
	}
	
	public native final EventRemover addEventListener(String type, EventListener listener, boolean useCapture)/*-{
//		var handler = 
//			@ru.sendto.gwt.client.html.WElement::toHandler(Lelemental/events/EventListener;)(listener);
//		var f = handler.@ru.sendto.gwt.client.html.WElement.Handler::exec(Lelemental/events/Event;);
		
		var f = function(event){
			console.log(event);
			console.log(listener);
			@ru.sendto.gwt.client.html.WElement::handleEvent(Lelemental/events/Event;Lelemental/events/EventListener;)(event,listener);
//			listener.@elemental.events.EventListener::handleEvent(Lelemental/events/Event;)(null);
		};
		return this.addEventListener(type, f, useCapture);
	}-*/;

//	public native final EventRemover addEventListener(String type, EventListener listener)/*-{
//		var f = listener.@elemental.events.EventListener::handleEvent(Lelemental/events/Event;);
//		return this.addEventListener(type, f);
//	}-*/;

	
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
