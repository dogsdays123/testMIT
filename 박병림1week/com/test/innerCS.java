package com.test;
import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;

public class innerCS{
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new evh());
    }
}

class evh implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("OCCURRED!!!");
    }
}
