package com.company;
import javax.swing.*;
public class UserRegistration {
    JFrame f;
    UserRegistration(){
        f=new JFrame();
        String data[][]={
                {"58","Mrigank","Cse","Lucknow"},
                {"57","Mohit","Cse","Hisar"},
                {"44","Harsh","Cse","Dhanbad"},

                {"29","Ashish","Cse","Kanpur"},
                {"46","Hemant","Cse","Hisar"}};
        String column[]={"rollno","name","class","address"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new UserRegistration();
    }
}