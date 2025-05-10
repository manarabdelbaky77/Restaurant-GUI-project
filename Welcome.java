import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Welcome extends JFrame {
    public Welcome() {
        JFrame splashFrame = new JFrame();
        splashFrame.setSize(500, 300);
        splashFrame.setLocationRelativeTo(null);
        splashFrame.setUndecorated(true); //Remove the outer frame
        splashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.white);
        ImageIcon welcomeIcon = new ImageIcon("C:\\Users\\HP\\Documents\\project visual\\practicle\\src\\g.png");
        JLabel imageLabel = new JLabel(welcomeIcon, SwingConstants.CENTER);
        JLabel welcomeLabel = new JLabel("Welcome to Our Restaurant", SwingConstants.CENTER);
        welcomeLabel.setForeground(Color.PINK);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 30));


        mainPanel.add(imageLabel, BorderLayout.NORTH);
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);

        splashFrame.add(mainPanel);
        splashFrame.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               splashFrame.dispose();
                new MenuFrame(); }
        });
        timer.setRepeats(false);
        timer.start();
    }


}
