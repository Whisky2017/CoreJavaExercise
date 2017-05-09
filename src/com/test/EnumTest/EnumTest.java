package com.test.EnumTest;

import java.util.Scanner;

/**
 * Created by wskyt on 2017/4/7.
 */
public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size = "+size.getString());
        System.out.println(Size.class);
    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String string;
    private Size(String string) {
        this.string = string;
    }
    public String getString(){
        return string;
    }
}
