package com.stu;

import java.io.*;

/**
 * @author BFSZ
 * @version 1.0.0
 * @className FileInputStreamDemo
 * @description 读取数据
 * @date 2018/10/15 13:07
 */
public class FileInputStreamDemo {
    private static InputStream input;
    private static OutputStream output;
    private static int length;

    public static void main(String[] args) throws IOException {
        //ioFileInputStream();
        //ioInputOutput();
        //fileInputStreamFun();
        //fileOutputStreamFun();
        fileOutputStreamFun("D:/Project/IO/ioDemo1.txt", "D:/Project/IO/ioDemo3.txt");
    }

    /**
     * @Description 字节输入流FileInputStream 读取数据
     * @Date 2018/10/15
     * @Param
     * @Return
     */
    private static void fileInputStreamFun() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/Project/IO/ioDemo1.txt");
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append((char) reader.read());
            }
            System.out.println(sb.toString());
            reader.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("读取数据失败！");
        }
    }

    /**
     * @Description 字节输出流FileOutputStream 数据写入  文件复制
     * @Date 2018/10/15
     * @Param
     * @Return
     */
    private static void fileOutputStreamFun(String fileName, String newFilename) {
        try {
            input = new FileInputStream(fileName);
            output = new FileOutputStream(newFilename);
            //获取文件长度
            int length = input.available();
            //创建缓存区域
            byte[] buffer = new byte[length];
            //写入数组
            input.read(buffer);
            output.write(buffer);
        } catch (IOException e) {
            System.out.println("数据复制失败");
        } finally {
            if (input != null && output != null) {
                try {
                    input.close();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * @Description 读取数据
     * @Date 2018/10/15
     * @Param
     * @Return
     */
    private static void ioFileInputStream() throws IOException {
        //使用字符串类型的文件名来创建一个输入流对象来读取文件
        InputStream f = new FileInputStream("D:/Project/IO/ioDemo.txt");
        int size = f.available();
        for (int i = 0; i < size; i++) {
            System.out.print((char) f.read());
        }
        f.close();


        //使用一个文件对象来创建一个输入流对象来读取文件
        //File file = new File("D:/Project/IO/ioDemo.txt");
        //InputStream input = new FileInputStream(file);

    }

    /**
     * @Description 写-读数据
     * @Date 2018/10/15
     * @Param
     * @Return
     */
    private static void ioInputOutput() throws IOException {
        //构建FileOutputStream对象,文件不存在会自动新建-写入数据
        File f = new File("D:/Project/IO/ioDemo1.txt");
        FileOutputStream fop = new FileOutputStream(f);

        //构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        writer.append("中文");
        writer.append("\r\n");
        writer.append("English");

        //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        writer.close();
        // 关闭输出流,释放系统资源
        fop.close();

        // 构建FileInputStream对象-读取数据
        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }
}
