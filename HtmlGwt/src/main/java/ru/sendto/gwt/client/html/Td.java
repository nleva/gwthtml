package ru.sendto.gwt.client.html;


public class Td extends WidgetBase {
	
	public Td() {
		super("td");
	}

	public void setRowspan(String rows){
		getElement().setAttribute("rowspan", rows);
	}
	public void setColspan(String cols){
		getElement().setAttribute("colspan", cols);
	}

}
