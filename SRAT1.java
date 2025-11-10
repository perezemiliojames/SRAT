import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class SRAT1 {
        /// size of window
    int BordWidth = 600;
    int BordHeight = 650;
    JFrame frame = new JFrame("SRAT SYSTEM"); // This will be the window and the title

    SRAT1() {
        /// Necesseties for the Window GUI
        frame.setVisible(true);
        frame.setSize(BordWidth, BordHeight);
        frame.setLocationRelativeTo(null); // launches the window at the center
        frame.setResizable(true); /// allows resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // essentiall to terminate program when user press X
        frame.setLayout(new BorderLayout()); // dunno what it does dont touch its necessary
        
        ///time check 5 am
        /// lets add a background image
        JPanel bgImage = new JPanel() {
            Image bg = new ImageIcon("bg.png").getImage();
            @Override
            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
        };
        bgImage.setLayout(new GridBagLayout());
        bgImage.setPreferredSize(new Dimension(BordWidth, BordHeight));
        frame.setContentPane(bgImage);
        ///i forgot to add the title, so lets do that
        /// time check: 4:27am
        JLabel menuTitle = new JLabel("SRAT", SwingConstants.CENTER);
        menuTitle.setFont(new Font("Arial",Font.BOLD, 40));
        menuTitle.setBackground(Color.WHITE); // sets the background color
        menuTitle.setOpaque(true);             // makes the color visible
        menuTitle.setBorder(new LineBorder(Color.BLACK, 2, true));
        /// time to add the menu panel baby
        JPanel menuPanel = new JPanel(); // we made this shit, now we gonna edit its properties
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS)); // this shi is good for our buttons
        menuPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100)); /// borders of our menu
        menuPanel.add(menuTitle);
        menuPanel.add(Box.createVerticalStrut(50)); 
        /// time check its 4:19 am
        
        ///now lets add the whopping buttons by using this neat trick i saw online]
        String[] buttonName = {"Select Class", "Manage Class", "Check Attendance", "Manage Records", "Exit"};
        for(int i = 0;i < buttonName.length;i++){
            String ButName = buttonName[i];
            JButton But = new JButton(ButName);
            But.setFont(new Font("Arial", Font.PLAIN, 30));
            But.setMaximumSize(new Dimension(300, 250));
            But.setAlignmentX(Component.CENTER_ALIGNMENT);
            menuPanel.add(But);
            menuPanel.add(Box.createVerticalStrut(5)); // this thingamajig spacing
            /// time check its 6:47 am time to add action listener
            But.addActionListener(e -> {
                JButton source = (JButton) e.getSource();
                /// so this variable store the choice 
                String choice = source.getText();

//_______________________________Button Logics_______________________________//

                switch(choice){
                    case "Exit" :
                        frame.dispose();
                        break;
                    case "Select Class" :
                        new SelectWindow();
                        break;
                    // case "Manage Class" :
                    //     ManageWindow();
                    //     break;
                    // case "Check Attendance" :
                    //     AttendanceWindow();
                    // case "Manage Records" :
                    //     RecordsWindow();
                    //     break;
                }


            }); 
        }



        ///wrapper so our shi is centered
        JPanel wrapper = new JPanel(new GridBagLayout());
        wrapper.add(menuPanel); // menuPanel is centered in wrapper
        wrapper.setOpaque(false);
        menuTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.setOpaque(false);
        menuPanel.add(Box.createVerticalStrut(20)); // spacing below title


        //windows gui
        bgImage.add(wrapper);
        bgImage.add(wrapper); // wrapper centers menuPanel on the background
        frame.setVisible(true);
        
}
    public static void main(String[] args) {
        new SRAT1(); // launch the app
    }
}