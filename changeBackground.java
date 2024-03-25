import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; // Import the JLabel class

public class changeBackground extends JFrame implements ActionListener {

    JFrame frame;
    JButton red, green, yellow;
    JLabel colorLabel; // Added JLabel to display the chosen color

    changeBackground() {
        Font font = new Font("Lucida Calligraphy", Font.BOLD, 9);
        frame = new JFrame("Colorful window");
        Color c = new Color(255, 255, 255);

        red = new JButton("RED");
        red.setBounds(40, 100, 100, 40);
        red.setFont(font);
        red.setBackground(c);

        green = new JButton("GREEN");
        green.setBounds(180, 150, 100, 40);
        green.setFont(font);
        green.setBackground(c);

        yellow = new JButton("YELLOW");
        yellow.setBounds(320, 200, 100, 40);
        yellow.setFont(font);
        yellow.setBackground(c);

        colorLabel = new JLabel("Chosen Color:"); // Create a label to show the chosen color
        colorLabel.setBounds(40, 250, 200, 20); // Adjusted position

        frame.add(red);
        frame.add(green);
        frame.add(yellow);
        frame.add(colorLabel); // Add the label to the frame

        red.addActionListener(this);
        green.addActionListener(this);
        yellow.addActionListener(this);

        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setSize(500, 350); // Adjusted size to accommodate the label
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == red) {
            frame.getContentPane().setBackground(Color.RED);
            colorLabel.setText("Chosen Color: RED"); // Update label text
        }
        if(ae.getSource() == green) {
            frame.getContentPane().setBackground(Color.GREEN);
            colorLabel.setText("Chosen Color: GREEN");
        }
        if(ae.getSource() == yellow) {
            frame.getContentPane().setBackground(Color.YELLOW);
            colorLabel.setText("Chosen Color: YELLOW");
        }
    }

    public static void main(String[] args) {
        new changeBackground();
    }
}
