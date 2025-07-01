package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminForm extends JFrame {
    private JButton btn_salir;
    private JPanel Panel_2;

    public AdminForm() {
        setTitle("Admin Form");
        setContentPane(Panel_2);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);


        btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginForm();
                dispose();
            }
        });
    }
}
