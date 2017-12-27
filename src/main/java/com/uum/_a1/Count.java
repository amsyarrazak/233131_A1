/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a1;

import java.io.File;

/**
 *
 * @author HP
 */
public class Count {

    public static int count(File file) {
        int num = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null & i < files.length; i++) {
                num = num + count(files[i]);
            }
        } else {
            num = num + 1;
        }

        return num;
    }
}
