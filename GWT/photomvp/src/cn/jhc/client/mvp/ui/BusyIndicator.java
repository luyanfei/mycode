package cn.jhc.client.mvp.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class BusyIndicator extends Composite {

	static BusyIndicator busy;

	@UiField FlowPanel view;

	static public void busy(){
		if (busy == null) busy = new BusyIndicator();
		busy.setVisible(true);
	}
	
	static public void free(){
		if (busy == null) busy = new BusyIndicator();
		busy.setVisible(false);
	}
	
	private static BusyIndicatorUiBinder uiBinder = GWT
			.create(BusyIndicatorUiBinder.class);

	interface BusyIndicatorUiBinder extends UiBinder<Widget, BusyIndicator> {
	}

	public BusyIndicator() {
		// Implement a simple "Busy" display that can be shown when application is busy.
		initWidget(uiBinder.createAndBindUi(this));
		this.setVisible(false);
		RootPanel.get().add(this,Window.getClientWidth()-200,40);
	}

}
