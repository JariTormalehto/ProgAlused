package components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/*
 * Chess.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
    public class Chess extends JPanel


        implements ActionListener {
    protected JButton b1, b2, b3, b4, b5, b6;

    public Chess() {
        ImageIcon King = createImageIcon("images/king.png");
        ImageIcon Queen = createImageIcon("images/queen.png");
        ImageIcon Rook = createImageIcon("images/rook.png");
        ImageIcon Bishop = createImageIcon( "images/bishop.png");
        ImageIcon Knight = createImageIcon("images/knight.png");
        ImageIcon Pawn = createImageIcon( "images/pawn.png");

        b1 = new JButton("King", King);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("enable");

        b2 = new JButton("Queen", Queen);
        b2.setMnemonic(KeyEvent.VK_M);
        b2.setActionCommand("enable");

        b3 = new JButton("Rook", Rook);
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");

        b4 = new JButton("Bishop", Bishop);
        b4.setMnemonic(KeyEvent.VK_D);
        b4.setActionCommand("enable");

        b5 = new JButton("Knight", Knight);
        b5.setMnemonic(KeyEvent.VK_M);
        b5.setActionCommand("enable");

        b6 = new JButton("Pawn", Pawn);
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b6.setMnemonic(KeyEvent.VK_E);
        b6.setActionCommand("enable");

        /*
        *
        * Actionlistener
        *
        * */

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);


        b1.setToolTipText("Click this button to learn about the King");
        b2.setToolTipText("Click this button to learn about the Queen.");
        b3.setToolTipText("Click this button to learn about the Rook.");
        b4.setToolTipText("Click this button to learn about the Bishop.");
        b5.setToolTipText("Click this button to learn about the Knight.");
        b6.setToolTipText("Click this button to learn about the Pawn.");

        //Add Components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }

    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(false);
            b5.setEnabled(false);
            b4.setEnabled(false);
            b6.setEnabled(false);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(true);
            b5.setEnabled(true);
            b4.setEnabled(true);
            b6.setEnabled(true);
        }
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Chess.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    class King extends JPanel {

    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Chess movements");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Chess newContentPane = new Chess();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}