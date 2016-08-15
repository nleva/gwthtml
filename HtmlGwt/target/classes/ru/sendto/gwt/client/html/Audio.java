package ru.sendto.gwt.client.html;

import com.google.gwt.dom.client.AudioElement;


public class Audio extends WidgetBase {
	
	public Audio() {
		super("audio");
	}

	public void setSrc(String url) {
		((AudioElement)getElement().cast()).setSrc(url);
	}
	public void setAutoplay(boolean auto) {
		((AudioElement)getElement().cast()).setAutoplay(auto);
	}
	public void setVolume(double vol) {
		((AudioElement)getElement().cast()).setVolume(vol);
	}
	public void play() {
		((AudioElement)getElement().cast()).play();
	}
	
}
