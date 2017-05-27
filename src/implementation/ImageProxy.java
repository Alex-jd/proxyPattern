package implementation;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import service.State;

public class ImageProxy implements Icon{
	ImageIcon imageIcon;
	URL imageURL;
	
	State imageIconNull;
	State imageIconExist;
	
	State state = imageIconNull;
	
	public ImageProxy (URL url) {
		imageURL = url;
		imageIconNull = new ImageIconNULL(this);
		imageIconExist = new ImageIconExist(this);
	}
	
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return state.getWidth();
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return state.getHeight();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		state.paintIcon(c, g, x, y);
	}
	
	ImageIcon getImageIcon() {
		return imageIcon;
	}
	
	void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
	URL getURL() {
		return imageURL;
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	State getImageIconExistState() {
		return imageIconExist;
	}
	
	State getImageIconNullState() {
		return imageIconNull;
	}

}
