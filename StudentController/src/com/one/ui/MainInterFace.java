package com.one.ui;

import com.one.util.ScreenUtils;

import javax.swing.*;

public class MainInterFace {

    JFrame jf = new JFrame("学生管理系统");

    final int WIDTH = 500;
    final int HEIGHT = 300;

    //组装各个视图
    public void init(){

        //设置窗口位置
        jf.setBounds((ScreenUtils.getScreenWidth()-WIDTH)/2,(ScreenUtils.getScreenHeight()-HEIGHT)/2,WIDTH,HEIGHT);


    }

    //程序入口
    public static void main(String[] args) {

    }
}
