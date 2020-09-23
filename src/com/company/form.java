package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form {
    public static void main(String[] args) {
        Frame f=new Frame("GJUS&T");
        final TextField a=new TextField();
        a.setBounds(250,350,200,20);
        Button b=new Button("CLICK HERE");
        b.setBounds(300,400,100,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("YOU ARE WELCOME TO GJUS&T");
            }
        });
        f.add(a).setBackground(Color.GREEN);
        f.add(b).setBackground(Color.GREEN); ;
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        f.setBackground(Color.BLUE);

    }
}
