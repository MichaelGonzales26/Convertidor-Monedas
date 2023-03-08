import javax.swing.JOptionPane;

public class EndMessage {
	
    private void MensajeSalida() {
        JOptionPane.showMessageDialog(null, "Programa finalizado");
        System.exit(0);
    }

    public void MensajeContinuar() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION == opcion){
            new Menu();
			Menu.main(null);
        }else{
            MensajeSalida();
        }
    }
    
}
