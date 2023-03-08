import javax.swing.JOptionPane;

public class OperacionesDivisas {
	
	public OperacionesDivisas() {
		
		String option = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "PEN a Dolar", "PEN a Euro", "PEN a Libras Esterlinas", "PEN a Yen",
						"PEN a Won", "Dolar a PEN", "Euro a PEN", "Libras Esterlinas a PEN",
						"Yen a PEN", "Won a PEN", },
				"option1");
		
		double conver = 0.0;
		double dolar = 0.26, euro = 0.25, libra = 0.22, yen = 35.89, won = 342.37;
		double PD = 3.78, PE = 4.03, PL = 4.55, PY = 0.028, PW = 0.0029;
		double resultado = 0;
		
		try {
			
			switch (option){
			// de soles a otra moneda
			case "PEN a Dolar":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Nuevos Soles quiere convertir A Dolares"));
				resultado = conver * dolar;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Dolares");
				break;
			case "PEN a Euro":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Nuevos Soles quiere convertir A Euros"));
				resultado = conver * euro;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Euros");
				break;
			case "PEN a Libras Esterlinas":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Nuevos Soles quiere convertir A Libras"));
				resultado = conver * libra;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Libras");
				break;
			case "PEN a Yen":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Nuevos Soles quiere convertir A Yenes"));
				resultado = conver * yen;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Yenes");
				break;
			case "PEN a Won":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Nuevos Soles quiere convertir A Wones"));
				resultado = conver * won;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Wones");
				break;
	
				//de otra moneda a Soles
			case "Dolar a PEN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Dolares quiere convertir A Nuevos Soles"));
				resultado = conver * PD;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Nuevos soles");
				break;
			case "Euro a PEN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Euros quiere convertir A Nuevos Soles"));
				resultado = conver * PE;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Nuevos soles");
				break;
			case "Libras Esterlinas a PEN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Libras quiere convertir A Nuevos soles"));
				resultado = conver * PL;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Nuevos soles");
				break;
			case "Yen a PEN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Yenes quiere convertir A Nuevos Soles"));
				resultado = conver * PY;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Nuevos soles");
				break;
			case "Won a PEN":
				conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos Wones quiere convertir A Nuevos Soles "));
				resultado = conver * PW;
				JOptionPane.showMessageDialog(null, "su total es de: " + resultado + " Nuevos soles");
				break;
			}
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Caracter no valido");
		}
		
		new EndMessage().MensajeContinuar();
	}
	

}
