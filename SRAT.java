import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class SRAT {
    /// size of window
    int BordWidth = 600;
    int BordHeight = 650;
    
    JFrame frame = new JFrame("SRAT SYSTEM"); // This will be the window and the title
    JLabel titlelabel = new JLabel(); // for label
    JPanel titlepanel = new JPanel(); // for panel
    JLabel menu1 = new JLabel(); // ahhsakdahkfsahf kill me

    SRAT() {
        /// Necesseties for the Window GUI
        frame.setVisible(true);
        frame.setSize(BordWidth, BordHeight);
        frame.setLocationRelativeTo(null); // launches the window at the center
        frame.setResizable(true); /// allows resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // essentially to terminate program when user press X
        frame.setLayout(new BorderLayout()); // dunno what it does dont touch its necessary

        ///for our title
        titlelabel.setFont(new Font("Arial", Font.PLAIN, 20)); // this sets our text font,size,and weight
        titlelabel.setHorizontalAlignment(JLabel.CENTER); // aligns our text to be center
        titlelabel.setText("Student Record and Attendance Tracker"); // Menu Title
        titlelabel.setOpaque(true);
        titlepanel.setLayout(new BorderLayout());
        titlepanel.add(titlelabel);
        frame.add(titlepanel);
        frame.add(titlepanel, BorderLayout.NORTH); /// makes our title appear on top
    
        ///for option1
        titlelabel.setFont(new Font("Arial", Font.PLAIN, 20)); // this sets our text font,size,and weight
        titlelabel.setHorizontalAlignment(JLabel.CENTER); // aligns our text to be center
        titlelabel.setText("Student Record and Attendance Tracker"); // Menu Title
        titlelabel.setOpaque(true);
        titlepanel.setLayout(new BorderLayout());
        titlepanel.add(titlelabel);
        frame.add(titlepanel);
        frame.add(titlepanel, BorderLayout.NORTH); /// makes our title appear on top
    }
}
