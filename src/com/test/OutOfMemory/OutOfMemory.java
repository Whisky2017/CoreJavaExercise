package com.test.OutOfMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wskyt on 2017/4/7.
 */
public class OutOfMemory {
    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }
}
