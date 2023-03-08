import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) {
		String option = (String) JOptionPane.showInputDialog(null, "Que desea convertir", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Convertidor de Divisa", "Convertidor de Temperatura" },
				null);
		
		switch (option) {
		case "Convertidor de Divisa":
			new OperacionesDivisas();
			break;
		case "Convertidor de Temperatura":
			new OperacionTemperatura();
			break;

		}
	}
}

