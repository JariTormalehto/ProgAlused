package components.Subclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pawn extends Container

{
    public static void main (String[]args){

        new Pawn();
    }

    public Pawn() {

        JFrame guiFrame = new JFrame();

        //make sure the program exits when the frame closes
        guiFrame.setTitle("Pawn movements");
        guiFrame.setSize(1280, 640);

        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);

        //The first JPanel contains a JLabel and JCombobox
        final JPanel image = new JPanel();
        JLabel comboLbl = new JLabel("Movements");


        image.add(comboLbl);


        JButton Close = new JButton("Close");

        //The ActionListener class is used to handle the
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
        guiFrame.add(image, BorderLayout.NORTH);
        guiFrame.add(Close, BorderLayout.SOUTH);

        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
}
