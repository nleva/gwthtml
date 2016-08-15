package ru.sendto.gwt.client.html;

import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.dom.client.CanvasElement;

public class Canvas extends WidgetBase {
	
	public Canvas() {
		super("canvas");
	}

	public void setHeight(String h){
		getCanvasElement().setAttribute("height", ""+h);
	}
	public int getHeight(){
		return getCanvasElement().getHeight();
	}
	
	public void setWidth(String w){
		Log.console("width="+w);
		getCanvasElement().setAttribute("width", w);
	}

	public int getWidth(){
		return getCanvasElement().getWidth();
	}
	
	public CanvasElement getCanvasElement(){
		return getElement().cast();
	}
	
	public Context2d getContext2D(){
		return getCanvasElement().getContext2d();
	}

}
