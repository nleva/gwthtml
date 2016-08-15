package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.ui.RootPanel;

public class Input extends WidgetBase {

	public static class DataList extends WidgetBase{
		
		public DataList() {
			super("datalist");
		}
		
		
	}
	public static final String defaultDataListId="defaultDataList";
	
	public Input() {
		super("input");
		setType("text");
	}

	public Input(String type) {
		super("input");
		setType(type);
	}

	public void setType(String type) {
		getElement().setAttribute("type", type);
	}

	public void setPlaceholder(String placeholder) {
		getElement().setAttribute("placeholder", placeholder);
	}

	public void setText(String text) {
		((InputElement) getElement().cast()).setValue(text);
	}

	public String getText() {
		return ((InputElement) getElement().cast()).getValue();
	}

	public void setValueFromData(String key){
		setValue(getData(key).toString());
	}
	public void setDataFromValue(String key){
		setData(key, getValue());
	}
	
	
	
	/**
	 * 
	 * @param separetedList список разделенный ";"
	 */
	public Input setDatalist(String separetedList) {
		return setDatalist(separetedList.split(";"));
	}

	DataList dataList;
	
	public Input setDatalist(String[] separetedList) {
		String dataID = getId();
		if(dataID==null){
			dataID=defaultDataListId;
		}else {
			dataID+="DataList";
		}
		if(dataList==null){
			dataList = new DataList();
			RootPanel.get().add(dataList);
			dataList.setId(dataID);
		}
		for (String opt : separetedList) {
			dataList.add(new Option(opt.replaceAll(""
					+ "("
					+ "\\("
					+ "|"
					+ "("
						+ "("
							+ "\\|[^\\)]+"
						+ ")?"
						+ "\\)"
					+ ")"
				+ ")", "")));
		}
		getElement().setAttribute("list", dataID);
		return this;
		
	}

	public void setChecked(boolean b){
		((InputElement)(getElement().cast())).setChecked(b);
		
	}
	
	public boolean isChecked(){
		return ((InputElement)(getElement().cast())).isChecked();
	}

	public void setGroup(String name){
		getElement().setAttribute("name", name);
	}

	public void setValue(String val){
		((InputElement)(getElement().cast())).setValue(val);
	}
	public String getValue(){
		return ((InputElement)(getElement().cast())).getValue();
	}
	public void setMax(String s) {
		getElement().setAttribute("max", s);

	}
	public void setMin(String s) {
		getElement().setAttribute("min", s);

	}

	public void setDisabled(boolean b){
		((InputElement)getElement().cast()).setDisabled(b);
	}
	public void wire(Label view) {
		Label.wire(this, view);
	}
}
