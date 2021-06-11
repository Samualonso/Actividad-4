package ejercicio2;

import java.awt.*;

public class Genero {
	private Panel panelGenero;
	
	public Genero() {
		panelGenero = new Panel(new FlowLayout());
		
		CheckboxGroup genero = new CheckboxGroup();
		
		Checkbox masculino = new Checkbox("Male", false, genero);
		Checkbox femenino = new Checkbox("Female", false, genero);
		
		
		panelGenero.add(new Label("Genero", Label.CENTER));
		panelGenero.add(masculino);
		panelGenero.add(femenino);
	}
	
	public Panel getPanel() {
		return panelGenero;
	}
	
}
