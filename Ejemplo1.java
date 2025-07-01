import javax.swing.JOptionPane;
import javax.swing.ImageIcon;//IMagenes
public class Ejemplo1
{
    public static void main(String args[])
    {
        ImageIcon icono=new ImageIcon(Ejemplo1.class.getResource("imagenes/fondo.jpg"));
        JOptionPane.showMessageDialog(null,"","Titulo de Arriba",
        JOptionPane.INFORMATION_MESSAGE,icono);
    }
}