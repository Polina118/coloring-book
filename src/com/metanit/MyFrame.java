package com.metanit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    int n = 25, m = 25;
    int sq = n * m;

    Pallete pallete = new Pallete();
    public MyButton[] btn = new MyButton[sq];

    MyFrame() {
        this.setLayout(new GridLayout(n, m));

        for (int i = 0; i < sq; i++) {
            btn[i] = new MyButton();
            this.add(btn[i]);
            btn[i].addActionListener(this);
        }
            this.setSize(1000, 1000);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < sq; i++) {
            if (e.getSource() == btn[i])
                btn[i].setBackground(pallete.getColor());
        }
    }
}

