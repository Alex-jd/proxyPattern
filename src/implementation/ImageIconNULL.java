package implementation;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

import service.State;

public class ImageIconNULL implements State{
	ImageProxy imageProxy;
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageIconNULL (ImageProxy imageProxy) {
		this.imageProxy = imageProxy;
		this.imageURL = imageProxy.getURL();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 800;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 600;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		g.drawString("Loading CD cover, please wait...", x+300, y+190);
		if (!retrieving) {
			retrieving = true;
			retrievalThread = new Thread(new Runnable(){
				public void run() {
					try {
						imageIcon = new ImageIcon(imageURL, "CD Cover");
						imageProxy.setImageIcon(imageIcon);
						imageProxy.setState(imageProxy.getImageIconExistState());
						c.repaint();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			retrievalThread.start();
		}
	}

}
