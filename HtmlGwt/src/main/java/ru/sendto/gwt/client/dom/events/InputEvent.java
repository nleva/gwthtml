/**
 * 
 */
package ru.sendto.gwt.client.dom.events;

import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.event.dom.client.DomEvent;

/**
 * @author Lev Nadeinskiy created Feb 9, 2016
 */
public class InputEvent extends DomEvent<InputHandler> {

	private static final Type<InputHandler> TYPE = new Type<InputHandler>(BrowserEvents.INPUT, new InputEvent());

	public static Type<InputHandler> getType() {
		return TYPE;
	}

	protected InputEvent() {
	}

	@Override
	public final Type<InputHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InputHandler handler) {
		handler.onChange(this);
	}

}