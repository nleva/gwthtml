package ru.sendto.gwt.client.html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class WidgetBase extends ComplexPanel implements HasChangeHandlers {

	private List<Input>			inputs;

	private Map<String, Object>	data;

	public Map<String, Object> getData() {
		if (data == null) {
			data = new HashMap<String, Object>();
		}
		return data;
	}

	public Object getData(String key) {
		if (data == null) {
			return null;
		}
		return data.get(key);
	}

	public void setData(String key, Object value) {
		getData().put(key, value);
	}

	public List<Input> getInputs() {
		if (inputs == null) {
			inputs = new ArrayList<Input>();
		}
		return inputs;
	}

	public WidgetBase() {
	}

	public WidgetBase(String tag) {
		WElement we = Document.get().createElement(tag).cast();
		we.setWidgetBase(this);
		setElement(we);

	}
	public WidgetBase(Element el) {
		WElement we = el.cast();
		we.setWidgetBase(this);
		setElement(we);

	}

	public void setId(String id) {
		getElement().setId(id);

	}

	public String getId() {
		return getElement().getId();
	}

	public void setHideByCheckbox(String id) {
		String[] split = id.split("\\s");
		for (int i = split.length - 1; i >= 0; i--) {
			Input cb = new Input("checkbox");
			cb.setId(split[i]);
			getInputs().add(cb);
			RootPanel.get().insert(cb, 0);
		}
	}

	public void setHideByRadio(String idGroup) {
		String[] split = idGroup.split("\\s");
		for (int i = split.length - 1; i >= 1; i -= 2) {
			Input cb = new Input("radio");
			cb.setId(split[i - 1]);
			cb.setGroup(split[i]);
			getInputs().add(cb);
			RootPanel.get().insert(cb, 0);
		}
	}

	public void add(Widget w) {
		w.removeFromParent();
//		ParentAccessor.setParent(w, asWidget());
		int beforeIndex = getWidgetCount();
		insert(w, beforeIndex);
//		adopt(w);
	}

	public void insert(Widget child, int beforeIndex) {
		insert(child, (Element) (getElement().cast()), beforeIndex, true);
//		ParentAccessor.setParent(child, asWidget());
//		Log.console(asWidget()+"-parent");
		// super.insert(child, beforeIndex);
	}

	public void setName(String id) {
		getElement().setId(id);

	}

	public String getName() {
		return getElement().getId();

	}

	public void setText(String text) {
		getElement().setInnerHTML(text);
	}

	public String getText() {
		return getElement().getInnerHTML();
	}

	public void setClass(String name) {
		//Фикс svg элементов для современных браузеров.
		if (addClassNative(getElement(), name))
			return;
		if (name != null && !name.equals(""))
			addStyleName(name);
	}

	public void addClass(String name) {
		setClass(name);
	}

	public void removeClass(String name) {
		//Фикс svg элементов для современных браузеров.
		if (removeClassNative(getElement(), name))
			return;
		if (name != null && !name.equals(""))
			removeStyleName(name);
	}

	/**
	 * Добавляет класс для элемента.
	 * Современные браузеры поддерживают classList, который есть и у svg элементов.
	 * @param el - для какого элемента.
	 * @param name - назвавание класса.
	 */
	private static native boolean addClassNative(Element el, String name)/*-{
		if (!el.classList)
			return false;
		if (name) {
			var nameArray = name.split(" ");
			for (var i = 0; i < nameArray.length; i++) {
				if (nameArray[i])
					el.classList.add(nameArray[i]);
			}
		}
		return true;
	}-*/;
	
	/**
	 * Удаляет класс у элемента.
	 * Современные браузеры поддерживают classList, который есть и у svg элементов.
	 * @param el - у какого элемента.
	 * @param name - назвавание класса.
	 */
	private static native boolean removeClassNative(Element el, String name)/*-{
		if (!el.classList)
			return false;
		if (name) {
			var nameArray = name.split(" ");
			for (var i = 0; i < nameArray.length; i++) {
				if (nameArray[i])
					el.classList.remove(nameArray[i]);
			}
		}
		return true;
	}-*/;
	
	public void click() {
		getElement().click();
	}

	public void focus() {
		getElement().focus();

	}

	public void setStyle(String style) {
		for (String s : style.trim().split(";")) {
			String[] prop = s.trim().split(":");
			getElement().getStyle().setProperty(prop[0], prop[1]);
		}
	}

	public void setAlign(String align) {
		getElement().setAttribute("align", align);
	}

	public void setBorder(String border) {
		getElement().setAttribute("border", border);
	}

	/*
	 * public WElement getElement() { return
	 * (WElement)super.getElement().cast(); }
	 */

	@Override
	public WElement getElement() {
		// TODO Auto-generated method stub
		return super.getElement().cast();
	}

	@Override
	public HandlerRegistration addChangeHandler(ChangeHandler h) {
		return addDomHandler(h, ChangeEvent.getType());
	}

	/**
	 * Универсальный метод для задания аттрибутов.
	 * @param attr - атрибуты в формате "name = value; name2 = value2;".
	 */
	public void setAttr(String attr) {
		String[] list = attr.split(";");
		for (int i = 0; i < list.length; ++i) {
			String[] val = list[i].split("=");
			if (val.length != 2)
				return ;
			getElement().setAttribute(val[0].trim(), val[1].trim());
		}
	}
	
	public WidgetBase setAttribute(String name, String value) {
		getElement().setAttribute(name, value);
		return this;
	}

	public WidgetBase setAttribute(String name, int value) {
		getElement().setAttribute(name, "" + value);
		return this;
	}
	
	public String getAttribute(String name) {
		return getElement().getAttribute(name);
	}
	
	public void removeAttribute(String name) {
		getElement().removeAttribute(name);
	}

	public void setFor(String id) {
		getElement().setAttribute("for", id);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		super.fireEvent(event);
	}

	/**
	 * Convenience function for setting disabled/enabled by boolean.
	 * 
	 * @param enabled
	 *            the enabled state
	 */
	public void setEnabled(boolean enabled) {
		if (!enabled) {
			disable();
		} else {
			enable();
		}
	}

	public void setDraggable(boolean draggable){
		getElement().setAttribute("draggable", ""+draggable);
	}
	
	/**
	 * Disable this widget.
	 */
	public void disable() {
		getElement().removeAttribute("enabled");
		getElement().setAttribute("disabled", "disabled");
	}
	/**
	 * Enable this widget.
	 */
	public void enable() {
		// onEnable();
		// disabled = false;
		getElement().removeAttribute("disabled");
		getElement().setAttribute("enabled", "enabled");
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return !getElement().hasAttribute("disabled");
	}
	private static native void setContentEditable(Element el, boolean b)/*-{
		el.contentEditable = b;
	}-*/;
 
	
	public void setContentEditable(boolean b){
		setContentEditable(getElement(), b);
	}

	void setTabIndex(int i){
		getElement().setTabIndex(i);
	}

}
