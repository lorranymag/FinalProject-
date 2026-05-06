import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) throws Exception {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Welcome");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(3, 1, 10, 10));

        JPanel topPanel = new JPanel();
        final JLabel lbFirstName = new JLabel("Enter your first name:");
        topPanel.add(lbFirstName);
        mainFrame.add(topPanel);

        JPanel centralPanel = new JPanel();
        final JTextField tfFirstName = new JTextField(10);
        centralPanel.add(tfFirstName);
        mainFrame.add(centralPanel);

        final JTextField tfAge = new JTextField(10);
        centralPanel.add(tfAge);

        JPanel bottomPanel = new JPanel();
        JButton okButton = new JButton("OK");
        bottomPanel.add(okButton);
        mainFrame.add(bottomPanel);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String sAge = tfAge.getText(); // ✅ fixed: reads from age field

                try {
                    int age = Integer.parseInt(sAge);
                    lbFirstName.setText("Hello " + firstName + ", age " + age); // ✅ actually uses age
                } catch (Exception except) {
                    lbFirstName.setText("Hello " + firstName + " (invalid age)");
                }
            }
        });

        mainFrame.setVisible(true);
    }
}
