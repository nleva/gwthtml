package ru.sendto.gwt.client.html;

import java.util.TreeMap;

import com.google.gwt.user.client.ui.WidgetCollection;

import ru.sendto.gwt.client.html.Select.EntryImpl;


public class Tree<T> extends WidgetBase {
	
	public Tree() {
		super("ol");
		setAttribute("id", "menutree");
	}
	
	TreeMap<String, String> nodes = new TreeMap<>();
	TreeMap<String, String> elements = new TreeMap<>();
	TreeMap<String, String> address = new TreeMap<>();
	
	public void addNodeElement(T t, String id) {
		Li li = new Li();
		li.setAttribute("draggable", "true");
						
		nodes.put(t.toString(),id);
		address.put(id,id);
		
		Input input = new Input();
		input.setAttribute("type", "checkbox");
		input.setAttribute("id", "cb"+id);
		
		Label label = new Label();
		label.setAttribute("class", "menu_label");
		label.setAttribute("for", "cb"+id);
		
		Span span = new Span();
		span.setText(t.toString());
		
		Ol ol = new Ol();
		ol.setAttribute("class", "el_list");
		
		li.add(input);
		label.add(span);
		li.add(label);
		
		li.add(ol);
		
		li.setAttribute("id", id);
		
		add(li);
		
	}
	
	public void addNodeElement(String parent, T t, String id) {
		
		String[] cells = address.get(parent).split("/");	
				
		WidgetBase widg = this;
		
		for (int i = 0; i < cells.length; i++) {
			
			int widgCount = ((WidgetBase)widg).getWidgetCount();
			
			for (int j = 0; j < widgCount; j++) {
				if (((WidgetBase)widg.getWidget(j)).getAttribute("id")==cells[i]) {					
					widg=((WidgetBase)((WidgetBase)((WidgetBase)widg.getWidget(j)).getWidget(2)));
				}
			}			
		}
		
		Li li = new Li();
		li.setAttribute("draggable", "true");
						
		nodes.put(t.toString(),id);
		address.put(id,address.get(parent)+"/"+id);
		
		Input input = new Input();
		input.setAttribute("type", "checkbox");
		input.setAttribute("id", "cb"+id);
		
		Label label = new Label();
		label.setAttribute("class", "menu_label");
		label.setAttribute("for", "cb"+id);
		
		Span span = new Span();
		span.setText(t.toString());
		
		Ol ol = new Ol();
		ol.setAttribute("class", "el_list");
		
		li.add(input);
		label.add(span);
		li.add(label);
		
		li.add(ol);
		
		li.setAttribute("id", id);
		
		widg.add(li);
		
	}
	
	public void addElement(String parent, T t, String id) {
		String[] cells = address.get(parent).split("/");	
		
		WidgetBase widg = this;
		
		for (int i = 0; i < cells.length; i++) {
			
			int widgCount = ((WidgetBase)widg).getWidgetCount();
			
			for (int j = 0; j < widgCount; j++) {
				if (((WidgetBase)widg.getWidget(j)).getAttribute("id")==cells[i]) {					
					widg=((WidgetBase)((WidgetBase)((WidgetBase)widg.getWidget(j)).getWidget(2)));
				}
			}			
		}
		
		elements.put(t.toString(),id);		
		
		Li li = new Li();
		li.setText(t.toString());
		li.setAttribute("class", "page");
		
		li.setAttribute("id", id);
		
		widg.add(li);
	}

}
