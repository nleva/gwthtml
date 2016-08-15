package ru.sendto.gwt.client.html;

import java.util.TreeMap;

import com.google.gwt.dom.client.SelectElement;



public class Select<T> extends WidgetBase {
	
	class EntryImpl {

		private T key;
		private Option value;
		
		public EntryImpl() {
		}
		
		
		public EntryImpl(T key, Option value) {
			super();
			this.key = key;
			this.value = value;
		}


		public T getKey() {
			return key;
		}
		
		public void setKey(T key) {
			this.key = key;
		}

		public Option getValue() {
			// TODO Auto-generated method stub
			return value;
		}

		public Option setValue(Option value) {
			this.value=value;
			return value;
		}
		
	}
	
	public Select() {
		super("select");
	}
	
	TreeMap<String, EntryImpl> options = new TreeMap<>();
	
	public void addOption(T option){
		addOption(option.toString(),option);
	}
	public void addOption(String toPrint, T option){
		Log.console("adding "+toPrint);
		Option o = new Option(toPrint);
		o.setText(toPrint);
		o.setValue(toPrint);
		add(o);
		EntryImpl e = new EntryImpl(option, o);
		options.put(toPrint, e);
		Log.console(e.getKey()+" "+e.getValue().getElement());
	}
	
	public void removeOption(String name){
		options.get(name).getValue().removeFromParent();
	}

	public T getOption(String name){
		Log.console(name);
		return options.get(name).getKey();
	}
	
	public Option getOptionWidget(String name){
		return options.get(name).getValue();
	}
	
	public T getValue(){
		return getOption(((SelectElement)getElement().cast()).getValue());
	}
	
	public void setSelected(int index) {
		((SelectElement)(getElement().cast())).setSelectedIndex(index);
	}
	
	public void setSelected(String string) {
		((SelectElement)(getElement().cast())).setValue(string);
	}
	
}
