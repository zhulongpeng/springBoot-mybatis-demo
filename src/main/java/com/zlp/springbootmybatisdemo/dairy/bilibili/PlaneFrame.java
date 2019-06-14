package com.zlp.springbootmybatisdemo.dairy.bilibili;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * @className:PlaneFrame
 * @Description
 * @author Ygritte
 * <a href="http://www.baidu.com" style="color:red;font-size:24px">baidu</a>
 * @version 1.0
 * @date
 */
public class PlaneFrame extends JFrame {

    //资源目录
    public static String path =  System.getProperty("user.dir") + "\\src\\main\\resources\\image";

    //存储图片文件
    public static HashMap<String, BufferedImage> maps = new HashMap<>();


    //加载资源,静态语句块最先加载
    static {
        //拿到目录下的资源目录
        System.out.println(path);
        File[] files = new File(path).listFiles();
        for(int i = 0; i < files.length; i++){
            //保存起来
            try {
                maps.put(files[i].getName(), ImageIO.read(files[i]));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(files[i].getName());
        }


    }


    //创建一个构造方法
    public PlaneFrame(){
        //设置标题
        this.setTitle("bilibili");
        //设置窗口的大小
        this.setSize(640, 700);
        //设置窗口可见
        this.setVisible(true);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口不可拖动
        this.setResizable(false);
        //创建一个小面板

    }

    public static void main(String[] args) {

        new PlaneFrame();
//        System.out.println("I love you");

        //思维

        //创建一个窗口

        //添加背景

        //添加飞机
    }
}

class PlanePanel extends JPanel{

    //小面板
    public void paint(Graphics2D g){
        //重叠
        super.paint(g);

        //创建一个绘制容器
        BufferedImage image = new BufferedImage(640, 700, BufferedImage.TYPE_INT_BGR);
        //创建一个笔
        Graphics2D gs = image.createGraphics();
        //绘制背景
        gs.drawImage(null, null, null);
    }
}
