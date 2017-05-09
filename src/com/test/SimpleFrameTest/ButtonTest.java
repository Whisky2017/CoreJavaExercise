package com.test.SimpleFrameTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hust on 2017/4/10.
 */
public class ButtonTest {


    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ButtonFrame frame = null;
                try {
                    frame = new ButtonFrame("ButtonTest");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}

class ButtonFrame extends JFrame{

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    private JPanel buttonPanel;
    private JButton yellowButton;
    private JButton blueButton;
    private JButton redButton;

    public ButtonFrame(){
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    public ButtonFrame(String title) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        setTitle(title);
        String plaf = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        UIManager.setLookAndFeel(plaf);
        SwingUtilities.updateComponentTreeUI(buttonPanel);
        setContentPane(new ButtonFrame().buttonPanel);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationByPlatform(true);

//        yellowButton = new JButton("Yellow");
//        blueButton = new JButton("Blue");
//        redButton = new JButton("Red");

//        buttonPanel = new JPanel();

//        buttonPanel.add(yellowButton);
//        buttonPanel.add(blueButton);
//        buttonPanel.add(redButton);


//        add(buttonPanel);
    }

    private class ColorAction implements ActionListener{

        private Color backgroundColor;

        public ColorAction(Color backgroundColor){
            this.backgroundColor = backgroundColor;
        }

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}


