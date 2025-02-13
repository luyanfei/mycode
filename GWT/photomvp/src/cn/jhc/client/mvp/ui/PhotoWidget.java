package cn.jhc.client.mvp.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class PhotoWidget extends Composite implements HasClickHandlers {

	private static PhotoWidgetUiBinder uiBinder = GWT
			.create(PhotoWidgetUiBinder.class);

	interface PhotoWidgetUiBinder extends UiBinder<Widget, PhotoWidget> {
	}

	@UiField Label title;
	// Would really be an Image in a real implementation
	@UiField FlowPanel photo;
	@UiField Label description;
	@UiField FocusPanel clickable;

	public PhotoWidget(String theTitle, String theDescription, String src) {
		initWidget(uiBinder.createAndBindUi(this));
		this.setSize("100%", "100%");
		// Actually, src in our example is the background colour to paint the image
		//photo.setUrl(src);
		photo.getElement().getStyle().setBackgroundColor(src);
		title.setText(theTitle);
		description.setText(theDescription);
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return clickable.addClickHandler(handler);
		
	}

}
