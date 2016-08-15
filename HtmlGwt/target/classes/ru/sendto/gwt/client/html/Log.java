package ru.sendto.gwt.client.html;

public class Log {

	static native public void console(Object o)/*-{
		console.log(o);
	}-*/;

}
