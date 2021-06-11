package ejercicio2;

import java.awt.*;

public class CamposTexto extends Component{
	private Panel panelTexto;
	
	public CamposTexto() {
		panelTexto = new Panel(new GridLayout(2, 2));
		
		panelTexto.add(new Label("Nombre", Label.CENTER));
		panelTexto.add(new TextField(20));
		panelTexto.add(new Label("Mobile", Label.CENTER));
		panelTexto.add(new TextField(10));
	}
	
	public Panel getPanel() {
		return panelTexto;
	}
}
