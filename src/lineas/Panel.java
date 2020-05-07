package lineas;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Panel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	private List<Cuadrado> cuadrados;
	private List<Triangulo> triangulos;
	
	public Panel() {
		 cuadrados = new ArrayList<Cuadrado>();
		 triangulos = new ArrayList<Triangulo>();
		 
	}
	
	public void dibujarCuadrado(Cuadrado c) {
		cuadrados.add(c);
		repaint();
	}
	
	public void dibujarTriangulo(Triangulo t) {
		triangulos.add(t);
		repaint();
	}
	
	public void undo() {
		cuadrados.remove(cuadrados.size()-1);
		triangulos.remove(triangulos.size()-1);
		repaint();
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		for(Cuadrado c : cuadrados) {
			c.dibujarc(g);
		}
		
		for (Triangulo t : triangulos) {
			t.dibujart(g);
			
		}
		
	}
	
}
