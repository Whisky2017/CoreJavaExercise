package com.test.SimpleFrameTest;

import javax.swing.*;

/**
 * Created by wskyt on 2017/4/9.
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        SimpleFrame simpleFrame = new SimpleFrame();
        simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleFrame.setVisible(true);
    }
}
class SimpleFrame extends JFrame{

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
