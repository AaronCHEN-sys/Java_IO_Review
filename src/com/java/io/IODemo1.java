package com.java.io;

import org.junit.Test;

import java.io.*;

/**
 * Description:	   字节流<br/>
 * Date:     0012, September 12 17:02 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class IODemo1 {
    /**
     * FileInputStream: 字节输入流
     */
    @Test
    public void test1() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Aaron\\Desktop\\Test\\Test.java");
            int read;
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * FileOutputStream: 字节输出流
     */
    @Test
    public void test2() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\Aaron\\Desktop\\Test\\Test.java");
            String string = "Hello Java!!!";
            fileOutputStream.write(string.getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 利用FileInputStream字节输入流和FileOutputStream字节输出流实现拷贝文件
     */
    @Test
    public void test3() {
        long start = System.currentTimeMillis();
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\Aaron\\Desktop\\Test\\test.mp3");
            FileOutputStream out = new FileOutputStream("C:\\Users\\Aaron\\Desktop\\Test\\aaa\\bbb\\ccc\\ddd\\eee\\test.mp3", true);

            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }

            out.close();
            in.close();

            long end = System.currentTimeMillis();
            System.out.println("时间：" + (end - start) / 1000 + "秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 利用BufferedInputStream字节缓存输入流和BufferedOutputStream字节缓存输出流实现快速拷贝文件
     */
    @Test
    public void test4() {
        long start = System.currentTimeMillis();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Aaron\\Desktop\\Test\\test.exe");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Aaron\\Desktop\\Test\\aaa\\bbb\\ccc\\ddd\\eee\\test.exe", true);

            BufferedInputStream in = new BufferedInputStream(fileInputStream);
            BufferedOutputStream out = new BufferedOutputStream(fileOutputStream);

            int read;
            byte[] bytes = new byte[1024];
            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            out.close();
            in.close();

            fileInputStream.close();
            fileOutputStream.close();

            long end = System.currentTimeMillis();
            System.out.println("时间：" + (end - start) / 1000 + "秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
