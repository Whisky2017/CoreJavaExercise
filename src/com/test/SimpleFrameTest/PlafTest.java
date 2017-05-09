package com.test.SimpleFrameTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hust on 2017/4/10.
 */
public class PlafTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PlafFrame frame = new PlafFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class PlafFrame extends JFrame{
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    private JPanel buttonPanel;

    public PlafFrame(){
        setTitle("PlafTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocationByPlatform(true);

        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos){
            makeButton(info.getName(), info.getClassName());
        }
        add(buttonPanel);
    }

    void makeButton(String name, final String plafName){
        JButton button = new JButton(name);
        buttonPanel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    UIManager.setLookAndFeel(plafName);
                    SwingUtilities.updateComponentTreeUI(PlafFrame.this);
                }catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (UnsupportedLookAndFeelException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}
