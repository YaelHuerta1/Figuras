package lineas;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado {
	
	private int dx ;
	private int dy ;
	private int x ;
	private int y ; 
	
	public Cuadrado(int x, int y, int dx, int dy) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		
	}
	
	public void dibujarc(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(x, y, dx, dy);
		
	}

}
