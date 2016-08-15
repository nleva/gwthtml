package ru.sendto.gwt.client.html;


public class Th extends WidgetBase {
	
	public Th() {
		super("th");
	}

	public void setRowspan(String rows){
		getElement().setAttribute("rowspan", rows);
	}
	public void setColspan(String cols){
		getElement().setAttribute("colspan", cols);
	}

}
