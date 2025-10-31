import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {  
    JFrame frame;
    JPanel panel;
    JButton button;
    JLabel label;
    int count = 0;

    public GUI() {
        
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Pinakamaangas na button");
        button.addActionListener(this);
        label = new JLabel("nyak Counter: 0");



        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gyat");
        frame.pack();
        frame.setVisible(true);

        ///panel shit
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
    }

    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Gay Counter: " + count);
    }
    
}
