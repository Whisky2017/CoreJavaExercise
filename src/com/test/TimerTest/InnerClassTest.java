package com.test.TimerTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by wskyt on 2017/4/9.
 */
public class InnerClassTest {
    public static void main(String[] args){
        TalkingClock talkingClock = new TalkingClock(1000,true);
        talkingClock.start();

        JOptionPane.showMessageDialog(null,"Quit program ?");
        System.exit(0);
    }

}

class TalkingClock{
    private boolean beep;
    private int interval;

    public TalkingClock(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }
    public void start(){
        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(interval,listener);
        timer.start();
    }

    private class TimePrinter implements ActionListener{

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone , the time is " + now);
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}