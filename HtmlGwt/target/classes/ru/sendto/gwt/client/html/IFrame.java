package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.IFrameElement;


public class IFrame extends WidgetBase {
	
	public IFrame() {
		super("iframe");
	}
	
	public IFrameElement getIFrameElement() {
		return super.getElement().cast();
	}
	
	public void setSrc(String src) {
		getIFrameElement().setSrc(src);

	}

}
