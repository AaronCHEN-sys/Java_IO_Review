package com.java.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:	   <br/>
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
            fileInputStream = new FileInputStream("C:\\Users\\Aaron\\Desktop\\Test\\Hello.java");
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
}
