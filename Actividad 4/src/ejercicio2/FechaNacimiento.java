package ejercicio2;

import java.awt.*;

public class FechaNacimiento {
	private Panel panelFecha;
	
	public FechaNacimiento() {
		panelFecha = new Panel(new FlowLayout());
		
		Choice dia = new Choice();
		for(int i = 1; i < 32; i++) {
			dia.add("" + i);
		}
		
		Choice mes = new Choice();
		mes.add("Jan");
		mes.add("Feb");
		mes.add("Mar");
		mes.add("Apr");
		mes.add("May");
		mes.add("Jun");
		mes.add("Jul");
		mes.add("Aug");
		mes.add("Sep");
		mes.add("Oct");
		mes.add("Nov");
		mes.add("Dec");
		
		
		panelFecha.add(new Label("DOB", Label.CENTER));
		panelFecha.add(dia);
		panelFecha.add(mes);
	}
	
	public Panel getPanel() {
		return panelFecha;
	}
}
