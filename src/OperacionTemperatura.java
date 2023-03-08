import javax.swing.JOptionPane;

public class OperacionTemperatura {
	
	public OperacionTemperatura () {
		
		String option = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Celsius a Farenheit", "Celsius a Kelvin", "Farenheit a Celsius",
						"Farenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Farenheit"},
				"option1");

		double conver = 0.0;
		double resultado = 0;
		
		try {
			
			switch(option) {
			
				case "Celsius a Farenheit":
					conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que temperatura desea convertir de Celsius a farenheit"));
					resultado = (conver * 9/5) + 32;
					JOptionPane.showMessageDialog(null, "La temperatura convertida de Celsius a farenheit es de : " + resultado + "°");
					break;
				case "Celsius a Kelvin":
					conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que temperatura desea convertir de Celsius a Kelvin"));
					resultado = conver + 273.15;
					JOptionPane.showMessageDialog(null, "La temperatura convertida de Celsius a Kelvin es de : " + resultado + "°");
					break;
				case "Farenheit a Celsius":
					conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que temperatura desea convertir de Farenheit a Celsius"));
					resultado = (conver - 32) * 5/9;
					JOptionPane.showMessageDialog(null, "La temperatura convertida de Farenheit a Celsius es de : " + resultado + "°");
					break;
				case "Farenheit a Kelvin":
					conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que temperatura desea convertir de Farenheit a Kelvin"));
					resultado = (conver - 32) * 5/9 + 273.15;
					JOptionPane.showMessageDialog(null, "La temperatura convertida de Farenheit a kelvin es de : " + resultado + "°");
					break;
				case "Kelvin a Celsius":
					conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que temperatura desea convertir de Kelvin a Celsius"));
					resultado = conver - 273.15;
					JOptionPane.showMessageDialog(null, "La temperatura convertida de Kelvin a Celsius es de : " + resultado + "°");
					break;
				case "Kelvin a Farenheit":
					conver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese que temperatura desea convertir de Kelvin a Farenheit"));
					resultado = (conver - 273.15) * 9/5 + 32;
					JOptionPane.showMessageDialog(null, "La temperatura convertida de Kelvin a Farenheit es de : " + resultado + "°");
					break;
			}
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Caracter no valido");
		}
		new EndMessage().MensajeContinuar();
	}
}
