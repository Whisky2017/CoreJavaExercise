package com.test.SimpleFrameTest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wskyt on 2017/4/9.
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SizedFrame sizedFrame = new SizedFrame();
                sizedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sizedFrame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2, screenHeight/2);
        setLocationByPlatform(true);
        setTitle("SizedFrame");
    }
}
