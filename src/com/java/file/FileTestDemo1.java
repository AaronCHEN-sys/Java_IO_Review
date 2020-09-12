package com.java.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Description:	   <br/>
 * Date:     0012, September 12 10:07 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public class FileTestDemo1 {

    @Test
    public void test1() {
        try {
            File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Hello.java");
            //创建单个文件
            boolean flag = file.createNewFile();
            System.out.println(flag ? "创建成功" : "创建失败");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Java学习资料");
        //创建单个文件夹
        boolean flag = file.mkdir();
        System.out.println(flag ? "创建成功" : "创建失败");
    }

    @Test
    public void test3() {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Java学习资料\\第4章函数和数组");
        //创建多级文件夹
        boolean flag = file.mkdirs();
        System.out.println(flag ? "创建成功" : "创建失败");
    }

    @Test
    public void test4() {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Hello.java");
        //测试文件或目录是否存在
        boolean flag = file.exists();
        System.out.println(flag ? "文件存在" : "文件不存在");
        //文件的长度
        long length = file.length();
        System.out.println("文件的长度：" + length);
    }

    @Test
    public void test5() {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Hello.java");
        //删除文件或目录
        boolean flag = file.delete();
        System.out.println(flag ? "删除成功" : "删除失败");
    }

    @Test
    public void test6() {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Hello.java");
        //重新命名此抽象路径名表示的文件
        boolean flag = file.renameTo(new File("C:\\Users\\Aaron\\Desktop\\Test\\Test.java"));
        System.out.println(flag ? "重命名成功" : "重命名失败");
    }

    @Test
    public void test7() {
        File file = new File("C:\\Users\\Aaron\\Desktop\\Test\\Hello.java");
        //测试此抽象路径名表示的文件是否是一个目录
        boolean flag = file.isDirectory();
        System.out.println(flag);

        //测试此抽象路径名表示的文件是否是一个标准文件
        boolean flag2 = file.isFile();
        System.out.println(flag2);

        //将此抽象路径名转换为一个路径名字符串
        String path = file.getPath();
        System.out.println(path);

        //返回由此抽象路径名表示的文件或目录的名称。
        String name = file.getName();
        System.out.println(name);

    }

}
