package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.TextAreaElement;

public class Textarea extends WidgetBase {

	public Textarea() {
		super("textarea");
	}

	public void setText(String text) {
		((InputElement) getElement().cast()).setValue(text);
	}

	public String getText() {
		return ((InputElement) getElement().cast()).getValue();
	}

	public void setRows(int rows) {
		((TextAreaElement)(getElement().cast())).setRows(rows);
	}

	public void setCols(int cols) {
		((TextAreaElement)(getElement().cast())).setCols(cols);
	}

	public void setPlaceholder(String placeholder) {
		getElement().setAttribute("placeholder", placeholder);
	}
}
