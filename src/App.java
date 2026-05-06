import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class App extends JFrame {

        public static void main (String [] args) throws Exception {
            JFrame mainFrame = new JFrame();
            mainFrame.setTitle ("Welcome");
            mainFrame.setSize(400,300);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new GridLayout (3, 1, 10, 10));

            JPanel topPanel = new JPanel();
            JLabel lbFirstName = new JLabel ("Enter your fisrt name:");
            topPanel.add(lbFirstName);
            mainFrame.add(topPanel);

            JPanel centralPanel = new JPanel();
            JTextField tfFirstName = new JTextField(10);
            centralPanel.add(tfFirstName);
            mainFrame.add(centralPanel);

            JTextField tfAge = new JTextField (10);
            centralPanel.add(tfAge);


            JPanel bottomPanel = new JPanel();
            JButton okButton = new JButton("OK");
            bottomPanel.add(okButton);
            mainFrame.add(bottomPanel);

            okButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText(); // gets the text from the TextField component
                lbFirstName.setText("Hello " + firstName); // updates the message on the label
                String sAge = tfFirstName.getText();

                try {
                     int age = Integer.parseInt(sAge); //convert the string to an int
                }

                catch(Exception execpt){


                }
               
   }
});



            mainFrame.setVisible(true); //last statment
        }
    }
