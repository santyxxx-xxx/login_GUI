import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton ACCESOButton;
    private JPanel principal;
    private JComboBox comboBox1;

    public LOGIN(){
        setTitle("Login");
        setContentPane(principal);
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        ACCESOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }
    public static void main(String[] args) {
        new LOGIN().setVisible(true);
    }}


