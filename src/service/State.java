package service;

import java.awt.Component;
import java.awt.Graphics;

public interface State {

	public int getWidth();

	public int getHeight();
	
	public void paintIcon(Component c, Graphics g, int x, int y);

}
