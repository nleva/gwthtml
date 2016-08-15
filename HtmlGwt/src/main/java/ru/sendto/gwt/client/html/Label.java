package ru.sendto.gwt.client.html;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.IsWidget;

public class Label extends WidgetBase {
	
	public Label() {
		super("label");
	}
	
	public void setFor(String st) {
		setAttribute("for", st);
	}
	
	public void setType(String st) {
		setAttribute("type", st);
	}
	
	public void add(Input child) {
		String uid ;
		String cid = child.getId();
		if(cid==null || cid==""){
			child.setId(DOM.createUniqueId());
		}
		setId(child.getId());
		super.add(child);
	}
	public void wire(Input cb) {
		wire(cb, this);
	}
	public static void wire(Input cb,Label view) {
		String id=null;
		id=cb.getId();
		id=(id==null || cb.getId().trim().isEmpty())?
				DOM.createUniqueId():id;
		cb.setId(id);
		view.setFor(id);
	}
}
