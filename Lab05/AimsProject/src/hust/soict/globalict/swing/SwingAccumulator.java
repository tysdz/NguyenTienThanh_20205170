package hust.soict.globalict.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//A Swing GUI application inherits from top-level container javax.swing.JFrame
public class SwingAccumulator extends JFrame{  // JFrame instead of Frame

    private JTextField tfCounTextField;
    private JButton btnCountButton;
    private int count = 0;

    public SwingAccumulator() {
        Container cpContainer = getContentPane(); // The content-pane sets its layout
        cpContainer.setLayout(new FlowLayout());
        cpContainer.add(new JLabel("Counter"));
        tfCounTextField = new JTextField("0");
        tfCounTextField.setEditable(false);
        cpContainer.add(tfCounTextField);

        btnCountButton = new JButton("Count");
        cpContainer.add(btnCountButton);

        // Allocate an anonymous instance of an anonymous inner class that
        // implements ActionListener as ActionEvent listener

        btnCountButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ++count;
                tfCounTextField.setText(count + "");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Swing Counter");
        setSize(300, 100);
        setVisible(true);  //show
    }

    // The entry main() method
    public static void main(String[] args) {
        // Run the GUI construction in the Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingAccumulator(); // Let the constructor do the job
            }
        });
    }
}

