package lineas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiComponente extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private Panel panel;
	
	public MiComponente() {
		
		panel = new Panel();
		
		JButton crearTringulo = new JButton("Crear Triangulo");
		crearTringulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int ix = (int) (panel.getWidth() * Math.random());
				int iy = (int) (panel.getHeight() * Math.random());;
				int b = 50;
				int h = 50;
				
				Triangulo t = new Triangulo(ix, iy, b, h);
				panel.dibujarTriangulo(t);
			}
		});
		
		JButton crarCuadrado = new JButton("Crear Cuadrado");
		crarCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int dx = 50;
				int dy = 50;
				int x = (int) (panel.getWidth() * Math.random());
				int y = (int) (panel.getHeight() * Math.random());;
				
				Cuadrado c = new Cuadrado(x, y, dx, dy);
				panel.dibujarCuadrado(c);
		
				/*Graphics g = panel.getGraphics();
				g.setColor(Color.BLACK);
				g.drawRect(x, y, dx, dy);
				g.dispose();*/
				
			}
		});
		
		add(panel);
		add(crarCuadrado, BorderLayout.NORTH);
		add(crearTringulo, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		
		JFrame jF = new MiComponente();
		jF.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jF.setSize(500, 500);
		jF.setVisible(true);
		jF.setLayout(new FlowLayout());
	
		

	}

}
