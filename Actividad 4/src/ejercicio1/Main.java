package ejercicio1;

import java.awt.*;
import ventanas.*;

public class Main {

	public static void Main(String[] args) {
		
		//Se crea la ventana y el panel principal
		MiVentana ventana = new MiVentana("Ejercicio 1", 900, 900);
		
		Panel panel = new Panel(new GridLayout(4, 5));
		
		ventana.add(panel);

		
		//Se crean los botones
		Button[] botones = new Button[20];
		for(int i = 1; i < 20; i++) {
			botones[i] = new Button("" + i);
		}
		
		
		//Se crean los paneles
		Panel panel1 = new Panel(new GridLayout(2, 2));
		panel1.add(new Button("A"));
		panel1.add(new Button("B"));
		panel1.add(new Button("C"));
		panel1.add(new Button("D"));
		
		Panel panel2 = new Panel(new GridLayout(1, 2));
		panel2.add(new Button("A"));
		panel2.add(new Button("B"));
		
		Panel panel3 = new Panel(new GridLayout(3, 1));
		panel3.add(new Button("A"));
		panel3.add(new Button("B"));
		panel3.add(new Button("C"));
		
		Panel panel4 = new Panel(new GridLayout(3, 1));
		panel4.add(new Button("A"));
		panel4.add(new Button("B"));
		panel4.add(new Button("C"));
		
		Panel panel5 = new Panel(new BorderLayout());
		panel5.add(new Button("A"), BorderLayout.NORTH);
		panel5.add(new Button("B"), BorderLayout.WEST);
		panel5.add(new Button("C"), BorderLayout.CENTER);
		panel5.add(new Button("D"), BorderLayout.EAST);
		panel5.add(new Button("E"), BorderLayout.SOUTH);
		
		Panel panel6 = new Panel(new GridLayout(1, 2));
		panel6.add(new Button("A"));
		panel6.add(new Button("B"));
		
		Panel panel7 = new Panel(new GridLayout(1, 2));
		panel7.add(new Button("A"));
		panel7.add(new Button("B"));
		
		Panel panel8 = new Panel(new GridLayout(1, 2));
		panel8.add(new Button("A"));
		panel8.add(new Button("B"));
		
		
		//Bucle para añadir los paneles y los botones.
		for(int i = 1; i <= 20; i++) {
			if(i == 1) {
				panel.add(panel1);
			}else if(i == 5) {
				panel.add(panel2);
			}else if(i == 10) {
				panel.add(panel6);
			}else if(i == 15) {
				panel.add(panel7);
			}else if(i == 20) {
				panel.add(panel8);
			}else if(i == 7) {
				panel.add(panel3);
			}else if(i == 13) {
				panel.add(panel4);
			}else if(i == 19) {
				panel.add(panel5);
			}else {
				panel.add(botones[i]);
			}
		}

	}

}
