package com.test;

import java.util.Scanner;

/**
 * Created by shikang on 2017/4/15.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        String out = "";
        if ((int)in.charAt(0)%2 == 0){
            System.out.println(in);
            return;
        }else {
            for (int i = 0; i < in.length();i++){
//                if ((in.charAt(i) <= 'z') && (in.charAt(i) >= 'a')){
                if (Character.isLowerCase(in.charAt(i))){
                    out += (in.charAt(i)+"").toUpperCase();
                }else if (Character.isUpperCase(in.charAt(i))){
                    out += (in.charAt(i)+"").toLowerCase();
                }else{
                    out += in.charAt(i);
                }
            }
            System.out.println(out);
            return;
        }
    }
}
