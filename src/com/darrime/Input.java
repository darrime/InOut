package com.darrime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Input {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:\\Develoapment\\Study\\test1.db");
        while(true) {
            int data = is.read();
            if(data == -1) break;
            System.out.println(data);
        }
        is.close();
    }
}
