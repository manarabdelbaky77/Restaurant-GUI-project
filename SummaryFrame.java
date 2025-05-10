import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SummaryFrame extends JFrame {

    public SummaryFrame(boolean pizzaSelected, boolean burgerSelected, boolean saladSelected, boolean grapeLeavesSelected,
                        int pizzaCount, int burgerCount, int saladCount, int grapeLeavesCount, MenuFrame menu) {
        setTitle("Order Summary");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JTextArea summaryArea = new JTextArea();
        summaryArea.setEditable(false);

        String summary = "Your Order:\n";
        int total = 0;
        if (pizzaSelected ) {

            summary += "Pizza x" + pizzaCount + " = " + (100 * pizzaCount) + " LE\n";
            total += 100 * pizzaCount;
        }
        if (burgerSelected ) {

            summary += "Burger x" + burgerCount + " = " + (70 * burgerCount) + " LE\n";
            total += 70 * burgerCount;
        }
        if (saladSelected ) {

            summary += "Salad x" + saladCount + " = " + (50 * saladCount) + " LE\n";
            total += 50 * saladCount;
        }
        if (grapeLeavesSelected ) {

            summary += "Grape Leaves x" + grapeLeavesCount + " = " + (60 * grapeLeavesCount) + " LE\n";
            total += 60 * grapeLeavesCount;
        }
        summary += "\nTotal = " + total + " LE";
        summaryArea.setText(summary);
        JPanel buttonPanel = new JPanel();
        JButton backButton = new JButton("Add More Items");
        backButton.setBackground(Color.pink);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                dispose();
                menu.setVisible(true); // return to menu
            } });
        JButton checkoutButton = new JButton("CheckOut");
        checkoutButton.setBackground(Color.pink);
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
                new CheckoutFrame();
            }

        });


        buttonPanel.add(backButton);
        buttonPanel.add(checkoutButton);

        mainPanel.add(summaryArea, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);
        setVisible(true);
    }
}