package components;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class King  extends Container {

    public static void main(String[] args) {

        new King();
    }

    public King() {

        JFrame guiFrame = new JFrame();

        //make sure the program exits when the frame closes
        guiFrame.setTitle("King movements");
        guiFrame.setSize(1280, 640);

        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);

        //The first JPanel contains a JLabel and JCombobox
        final JPanel image = new JPanel();

        JPanel titlePanel = new JPanel();
        JPanel leftPanel = new JPanel();
        leftPanel.setSize(430,215);
        JPanel rightPanel = new JPanel();
        titlePanel.setBackground(Color.cyan);
        JLabel comboLbl = new JLabel("Movements");
        titlePanel.add(comboLbl);


        ImageIcon  kingIcon =new ImageIcon(this.getClass().getResource("images/kingmove.png"));
        JPanel kingImagePanel = new JPanel(){
            public void paintComponent(Graphics g) {
                Dimension dimension = getSize();
                g.drawImage(kingIcon.getImage(), 310, 0, dimension.width/2, dimension.height, null);
            }
        };

        image.add(titlePanel);
        image.add(kingImagePanel);


        JButton Close = new JButton("Close");

        //event that happens when the user clicks the button.
        //As there is not a lot that needs to happen we can
        //define an anonymous inner class to make the code simpler.
        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (evt.getSource() == Close) {
                    guiFrame.dispose();
                }

            }
        });

        //The JFrame uses the BorderLayout layout manager.
        //Put the two JPanels and JButton in different areas.
        guiFrame.add(titlePanel, BorderLayout.NORTH);

        guiFrame.add(kingImagePanel, BorderLayout.CENTER);
        guiFrame.add(rightPanel, BorderLayout.EAST);
        guiFrame.add(leftPanel, BorderLayout.WEST);
        guiFrame.add(Close, BorderLayout.SOUTH);

        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }

}
