package com.java.file;

import java.io.File;

/**
 * Description:	   递归算法<br/>
 * Date:     0012, September 12 11:46 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class RecursionDemo {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\aaa");
        File[] files = file.listFiles();
        printFileName(file);
    }

    /**
     * 打印某个文件夹下所有的文件
     */
    public static void printFileName(File file) {
        //1.判断file是文件还是文件夹
        boolean flag = file.isDirectory();
        if (flag) {
            //file是文件夹,遍历此文件夹下所有的文件
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                File file1 = files[i];
                System.out.println(file1.getPath());
                printFileName(file1);
            }
        } else {
            //file是普通文件,则直接打印文件路径
            System.out.println(file.getPath());
        }
    }

}
