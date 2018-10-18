package com.stu;

import java.io.*;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className IoStreamFile
 * @description Java 流(Stream)、文件(File)和IO
 * @date 2018/10/15 12:28
 */
public class IoStreamFile {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按‘q’结束");
        //读取字符
        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != 'q');
    }
}
