
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class FactorialCalculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Factorial: ");

        calculateButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number: "));
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String inputText = inputField.getText();
            try {
                int number = Integer.parseInt(inputText);
                int factorial = calculateFactorial(number);
                resultLabel.setText("Factorial: " + factorial);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        }
    }

    private int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FactorialCalculator calculator = new FactorialCalculator();
            calculator.setVisible(true);
        });
    }
}

