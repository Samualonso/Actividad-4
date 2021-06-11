package ejercicio2;

import java.awt.*;

import ventanas.MiVentana;

public class Main {

	public static void Main(String[] args) {
		
		MiVentana ventana = new MiVentana("Ejercicio 2", 400, 400);
		
		FlowLayout layoutPrincipal = new FlowLayout();
		layoutPrincipal.setVgap(5);
		
		Panel panel = new Panel(layoutPrincipal);
		ventana.add(panel);
		panel.add(new Label("Registration Form", Label.CENTER));
		
		Panel panelIzq = new Panel(new GridLayout(2, 2));
		panel.add(panelIzq);
		
		panelIzq.add(new CamposTexto().getPanel());
		panelIzq.add(new Genero().getPanel());
		
	}

}
