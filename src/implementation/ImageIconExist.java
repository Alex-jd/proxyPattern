package implementation;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import service.State;

public class ImageIconExist implements State{
	ImageProxy imageProxy;
	ImageIcon imageIcon;
	
	public ImageIconExist (ImageProxy imageProxy) {
		this.imageProxy = imageProxy;
		this.imageIcon = imageProxy.getImageIcon();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return imageIcon.getIconWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return imageIcon.getIconHeight();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		imageIcon.paintIcon(c, g, x, y);
		
	}

}
