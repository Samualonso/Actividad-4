package ejercicio3;

import java.awt.*;
import java.awt.event.*;

import ventanas.*;

public class Main {

	public static void main(String[] args) {
		MiVentana ventana = new MiVentana("Ejercicio 3", 400, 400);
		Panel panel = new Panel(new GridLayout(2, 2));
		ventana.add(panel);
		
		Button b1, b2;
		b1 = new Button("Botón 1");
		b2 = new Button("Botón 2");
		panel.add(b1);
		panel.add(b2);
		
		Label etiqueta = new Label("");
		panel.add(etiqueta);

		b2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("Has pulsado el botón 2");
			}
		});
		
		b1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				etiqueta.setText("Has pulsado el botón 1");
			}
		});
	}

}
