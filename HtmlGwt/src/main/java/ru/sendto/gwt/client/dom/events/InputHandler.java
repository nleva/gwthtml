package ru.sendto.gwt.client.dom.events;

import com.google.gwt.event.shared.EventHandler;

/**
 * @author Lev Nadeinskiy created Feb 9, 2016
 */
public interface InputHandler extends EventHandler {

	void onChange(InputEvent event);
}
