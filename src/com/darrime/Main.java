package com.darrime;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void out(String name, String something) throws Exception {
        Writer writer = new FileWriter("C:\\Develoapment\\Study\\" + name +".txt");
        String write = something;

        writer.write(write);

        writer.flush();
        writer.close();
    }


    public static void main(String[] args) throws Exception {
        System.out.println("파일명: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("내용작성");
        Scanner scanner1 = new Scanner(System.in);
        String want = scanner1.next();
        
        out(name, want);
    }
}
