package Forms;

import javax.swing.*;

public class PlayerForm extends JFrame {
    private JTextField txt_name;
    private JTextField txt_lastname;
    private JTextField txt_age;
    private JTextField txt_height;
    private JTextField txt_name_team;
    private JButton btn_add;
    private JButton btn_exit;
    private JButton btn_show;
    private JPanel Panel_3;
    private JTable table_data;
    private JButton btn_clean;

    public PlayerForm() {
        setTitle("Player Form");
        setContentPane(Panel_3);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);


    }
}
