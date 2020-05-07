package lineas;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo {
	
	private int ix ;
	private int iy ; 
	private int b ;
	private int h ;

	public Triangulo(int ix, int iy, int b, int h) {
		this.ix = ix;
		this.iy = iy;
		this.b = b;
		this.h = h;
	}
	
	public void dibujart(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(ix, iy, ix+b, iy);
		g.drawLine(ix+b, iy, ix+b/2, iy-h);
		g.drawLine(ix+b/2,iy-h, ix, iy);
		
	}

}
