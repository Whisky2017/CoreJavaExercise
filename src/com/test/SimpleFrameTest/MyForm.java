package com.test.SimpleFrameTest;

import javax.swing.*;

/**
 * Created by wskyt on 2017/4/9.
 */
public class MyForm {
    private JButton button1;
    private JButton button2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPasswordField passwordField1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JTextField textField5;
    private JTextArea textArea1;
    private JPanel MyPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyForm");
        frame.setContentPane(new MyForm().MyPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
//        System.out.println((int)'a');

    }
}
