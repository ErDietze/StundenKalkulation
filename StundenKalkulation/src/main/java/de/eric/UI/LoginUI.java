package de.eric.UI;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI
public class LoginUI extends UI {

	private VerticalLayout loginRoot;

	@Override
	protected void init(VaadinRequest request) {

		setupLoginRoot();
		addHeader();
		addForm();
		addLoginButton();

	}

	private void setupLoginRoot() {
		loginRoot = new VerticalLayout();
		setContent(loginRoot);

	}

	private void addHeader() {
		loginRoot.addComponent(new Label("Stundenkalkulator"));
	}

	private void addForm() {
		HorizontalLayout innerLayout = new HorizontalLayout();
		
		

	}

	private void addLoginButton() {
		Button loginButton = new Button();
		loginButton.addStyleName(ValoTheme.BUTTON_PRIMARY);
		loginButton.setIcon(VaadinIcons.ENTER);
		loginRoot.addComponent(loginButton);

	}

}
