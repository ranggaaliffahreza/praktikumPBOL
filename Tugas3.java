import javax.swing.*;
import java.awt.*;

public class Tugas3 extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Tugas3() {
        setTitle("Login and Register");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createLoginPanel(), "Login");
        mainPanel.add(createRegisterPanel(), "Register");

        add(mainPanel);
        cardLayout.show(mainPanel, "Login");
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        JLabel emailLabel = new JLabel("Email");
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(emailField, gbc);

        JLabel passwordLabel = new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(loginButton, gbc);

        JButton switchToRegisterButton = new JButton("Register");
        switchToRegisterButton.addActionListener(e -> cardLayout.show(mainPanel, "Register"));
        gbc.gridy = 4;
        panel.add(switchToRegisterButton, gbc);

        return panel;
    }

    private JPanel createRegisterPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("REGISTER");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        JLabel nameLabel = new JLabel("Name");
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        JLabel emailLabel = new JLabel("Email");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(emailField, gbc);

        JLabel passwordLabel = new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        JButton registerButton = new JButton("Register");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(registerButton, gbc);

        JButton switchToLoginButton = new JButton("Login");
        switchToLoginButton.addActionListener(e -> cardLayout.show(mainPanel, "Login"));
        gbc.gridy = 5;
        panel.add(switchToLoginButton, gbc);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tugas3 app = new Tugas3();
            app.setVisible(true);
        });
    }
}
