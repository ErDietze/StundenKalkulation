package de.eric.UI;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class LoginUI extends UI{

	private VerticalLayout loginRoot;
	
	@Override
	protected void init(VaadinRequest request) {
		
		setupLoginRoot();
		addHeader();
		addForm();
		addLoginButton();	
		
	}

	private void setupLoginRoot() {
		// TODO Auto-generated method stub
		
	}

	private void addHeader() {
		// TODO Auto-generated method stub
		
	}

	private void addForm() {
		// TODO Auto-generated method stub
		
	}

	private void addLoginButton() {
		// TODO Auto-generated method stub
		
	}

}
