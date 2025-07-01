import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN extends JFrame {
    private JTextField txtUsuario;
    private JButton ACCESOButton;
    private JPanel principal;
    private JComboBox comboRoll;
    private JPasswordField txtClave;

    public LOGIN() {
        setTitle("Login");
        setContentPane(principal);
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ACCESOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String clave = String.valueOf(txtClave.getPassword());
                String rol = (String) comboRoll.getSelectedItem();

                if (rol.equals("Administrador")&& usuario.equals("admin")&& clave.equals("123")){
                    new Administrador().setVisible(true);
                    dispose();
                }
                if (rol.equals("jugador")&& usuario.equals("jugador")&& clave.equals("123")){
                    new jugador().setVisible(true);
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        new LOGIN().setVisible(true);
    }
}





