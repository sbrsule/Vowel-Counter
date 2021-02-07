import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class VowelCounter extends JFrame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton enterText = new JButton();
    JButton clearText = new JButton();
    JLabel labelText = new JLabel();
    JFrame inputFrame = new JFrame();
    JLabel vowelLabel = new JLabel();
    ImageIcon icon = new ImageIcon("VowelCounter Icon.png");
    JTextField wordInput;
    int vowels = 0;

    VowelCounter() {
        labelText.setText("Please Enter The Word(s) You Would Like To Check");
        labelText.setForeground(Color.white);
        labelText.setBounds(94, 50, 300, 30);
        labelText.setFocusable(false);

        enterText.setText("Check");
        enterText.setForeground(Color.white);
        enterText.setBackground(Color.black);
        enterText.setBounds(188, 140, 100, 30);
        enterText.addActionListener(this);
        enterText.setFocusable(false);

        clearText.setText("Clear");
        clearText.setForeground(Color.white);
        clearText.setBackground(Color.black);
        clearText.setBounds(203, 180, 70, 30);
        clearText.addActionListener(this);
        clearText.setFocusable(false);

        wordInput = new JTextField();
        wordInput.setBackground(Color.black);
        wordInput.setForeground(Color.white);
        wordInput.setBounds(100, 90, 275, 30);
        wordInput.setHorizontalAlignment(JTextField.CENTER);

        vowelLabel.setText("");
        vowelLabel.setForeground(Color.white);
        vowelLabel.setBounds(138, 215, 200, 30);
        vowelLabel.setFocusable(false);
        vowelLabel.setHorizontalAlignment(JLabel.CENTER);

        inputFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        inputFrame.setPreferredSize(new Dimension(500, 300));
        inputFrame.getContentPane().setBackground(Color.black);
        inputFrame.setTitle("Vowel Counter");
        inputFrame.setIconImage(icon.getImage());
        inputFrame.setResizable(false);
        inputFrame.add(labelText);
        inputFrame.add(wordInput);
        inputFrame.add(enterText);
        inputFrame.add(clearText);
        inputFrame.add(vowelLabel);
        inputFrame.setLayout(null);
        inputFrame.pack();
        inputFrame.setVisible(true);
        inputFrame.setFocusable(false);
        inputFrame.setLocationRelativeTo(null);
    }

    public static int wordChecker(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'A':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'E':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'I':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'O':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'U':
                    count++;
                    break;
                case 'y':
                    count++;
                    break;
                case 'Y':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterText) {
            if (wordChecker(wordInput.getText()) == 0) {
                vowelLabel.setText("There are no vowels in your input");
            } else if (wordChecker(wordInput.getText()) == 1) {
                vowelLabel.setText("There is 1 vowel in your input");
            } else {
                vowelLabel.setText("There are " + wordChecker(wordInput.getText()) + " vowels in your input");
            }
        }
        if (e.getSource() == clearText) {
            wordInput.setText(null);
            vowelLabel.setText(null);
        }
    }

    public static void main(String[] args) {
        new VowelCounter();
    }
}
