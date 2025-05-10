import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckoutFrame extends JFrame {
    JFrame checkoutFrame;

    public CheckoutFrame() {

            checkoutFrame = new JFrame("Customer Details");
            checkoutFrame.setSize(350, 200);
            checkoutFrame.setLayout(new BorderLayout());
            checkoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
            JLabel nameLabel = new JLabel("Name:");
            nameLabel.setBounds(30, 20, 80, 25);
            JTextField nameField = new JTextField();
            nameField.setBounds(120, 20, 170, 25);
            JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(30, 60, 80, 25);
            JTextField phoneField = new JTextField();
        phoneField.setBounds(120, 60, 170, 25);
            JLabel addressLabel = new JLabel("address");
        addressLabel.setBounds(30, 100, 80, 25);
            JTextField addressField = new JTextField();
        addressField.setBounds(120, 100, 170, 25);

            formPanel.add(nameLabel);
            formPanel.add(nameField);
            formPanel.add(phoneLabel);
            formPanel.add(phoneField);
            formPanel.add(addressLabel);
            formPanel.add(addressField);
            JButton placeButton = new JButton("Place Order");
            placeButton.setBackground(Color.pink);
            placeButton.setBounds(120,140,120,25);
            formPanel.add(placeButton);
            placeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    if (nameField.getText().isEmpty() || phoneField.getText().isEmpty() || addressField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(checkoutFrame, "Please fill in all fields.");
                    } else {
                        checkoutFrame.dispose();
                        JOptionPane.showMessageDialog(null, "The order placed , thank you " + nameField.getText() + "!");
                        System.exit(0);
                    }
                }
            });

            checkoutFrame.add(formPanel, BorderLayout.CENTER);
            checkoutFrame.setVisible(true);
        }
}

