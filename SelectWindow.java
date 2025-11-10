import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SelectWindow extends JFrame{
    
    public SelectWindow() {
        setTitle("Select Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closes just this window
        setLocationRelativeTo(null); // center


    //     //_______________________________________main window________________________//
       JPanel menuPanel = new JPanel(); // we made this shit, now we gonna edit its properties
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS)); // this shi is good for our buttons
        menuPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100)); /// borders of our menu
        menuPanel.add(Box.createVerticalStrut(50)); 
    //     JLabel Title = new JLabel("Select:", SwingConstants.CENTER);
    //     menuPanel.add(Title);
        
        String[] buttonName = {"BSCS 1A", "BSIT 1B", "Add New"};
        for(int i = 0;i < buttonName.length;i++){
            String ButName = buttonName[i];
            JButton But = new JButton(ButName);
            But.setFont(new Font("Arial", Font.PLAIN, 20));
            But.setMaximumSize(new Dimension(500, 350));
            But.setAlignmentX(Component.TOP_ALIGNMENT);
            menuPanel.add(But);
            menuPanel.add(Box.createVerticalStrut(5)); // this thingamajig spacing
        }
        add(menuPanel);
        // add(Title);
        setVisible(true);
    }
    }
