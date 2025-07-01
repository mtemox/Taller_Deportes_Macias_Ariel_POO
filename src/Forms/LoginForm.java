package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private static final String user = "ariel123";
    private static final String password = "ariel123";
    private JTextField txt_user;
    private JButton btn_login;
    private JPasswordField txt_pss;
    private JComboBox cbox_rol;
    private JPanel Panel_1;

    public LoginForm() {
        setTitle("Login Form");
        setContentPane(Panel_1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        cbox_rol.setSelectedIndex(-1);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userInput = txt_user.getText();
                char[] passInputChar = txt_pss.getPassword();
                String pasInput = new String(passInputChar);
                Object selected = cbox_rol.getSelectedItem();
                int cbox_index = cbox_rol.getSelectedIndex();

                if (cbox_index > -1) {
                    if (selected.equals("Admin")) {
                        if (validateCredentials(userInput, pasInput, selected)) {
                            new AdminForm();
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                        }

                    } else if (selected.equals("Admin")) {
                        if (validateCredentials(userInput, pasInput, selected)) {
                            new PlayerForm();
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                        }
                    }

                    if (validateCredentials(userInput, pasInput, selected)) {

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se seleccionó ningún rol.");
                }
            }
        });
    }

    private boolean validateCredentials(String userInput, String passInput, Object rol) {
        return userInput.equals(user) && passInput.equals(password) &&
                (rol.equals("Admin") || rol.equals("Player"));
    }
}
