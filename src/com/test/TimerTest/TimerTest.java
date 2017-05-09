package com.test.TimerTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by wskyt on 2017/4/9.
 */
public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(10000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program ?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

