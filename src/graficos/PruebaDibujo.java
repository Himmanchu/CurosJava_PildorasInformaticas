package graficos;

import javax.swing.*;

import java.awt.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujos mimarco=new MarcoConDibujos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("Prueba de dibujo");
		
		setSize(600,600);
		
		setVisible(true);
		
		LaminaConFiguras laminaFigura=new LaminaConFiguras();
		
		add(laminaFigura);
	
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 300, 50);
		
		g.drawLine(100, 100, 300, 200);
		
		
	
	}
}
