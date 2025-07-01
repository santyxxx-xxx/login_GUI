import javax.swing.*;

public class TABLA extends JFrame{
    private JTable table1;
    private JButton AGREGARButton;
    private JButton MOSTRARButton;
    private JButton LIMPIARButton;
    private JButton SALIRButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel principal;

    public TABLA(){
    setTitle("Login");
    setContentPane(principal);
    setSize(500,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
}
}
