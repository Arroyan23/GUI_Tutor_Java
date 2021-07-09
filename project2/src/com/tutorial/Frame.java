package com.tutorial;
import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
     Frame(){

        this.setTitle("Royan Software"); //meenset untuk judulnya
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit app and stop running
        this.setSize(420 , 420); //set untuk size nya
        this.setVisible(true); //memunculkan display dari jthis
        this.setResizable(false); //tidak bisa di besar dan di kecilkan

        //membuat gambar baro
        ImageIcon icon1 = new ImageIcon("logo.jpg");
        this.setIconImage(icon1.getImage()); //menaruh icon ke lambang software
        this.getContentPane().setBackground(new Color(123,50,250));//mengubah warna background
        //rgb = 0 , 0 , 0 ;
        //hexa des = 0x(hexa desimal color)
    }
}
