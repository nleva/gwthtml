package ru.sendto.gwt.client.html;



public class Nav extends WidgetBase {
	
	private String role;
	
	public Nav() {
		super("nav");
	}

	public void setRole(String role) {
		getElement().setAttribute("role", role);
	}
	public String getRole() {
		return getElement().getAttribute("role");
	}
	
}
