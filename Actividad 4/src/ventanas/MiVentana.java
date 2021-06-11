package ventanas;


import java.awt.Frame;
import java.awt.event.*;

public class MiVentana extends Frame {
	
	public MiVentana(String titulo, int ancho, int alto, int x, int y) {
		this.setSize(ancho, alto);
		this.setTitle(titulo);
		this.setVisible(true);
		this.setLocation(x, y);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}

	public MiVentana(String titulo, int ancho, int alto) {
		this(titulo, ancho, alto, 0, 0);
	}

	public MiVentana(String titulo) {
		this(titulo, 400, 200);
	}

	public MiVentana() {
		this("Mi ventana", 400, 200);
	}
}
