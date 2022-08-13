package com.metanit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pallete extends JFrame implements ActionListener {
    JButton Chose = new JButton("Pick a color");
    JButton ClearBut = new JButton("CLEAR");
    Color color;

    Pallete() {
        Chose.setBackground(Color.white);
        ClearBut.setBackground(Color.white);

        Chose.setFocusable(false);
        ClearBut.setFocusable(false);

        color = new Color(255,0,0);

        Chose.addActionListener(this);
        ClearBut.addActionListener(this);

        this.add(Chose);
        this.add(ClearBut);

        this.setLayout(new GridLayout(2,1));
        this.setBounds(1000,0,200,420);
        this.setVisible(true);
    }
    public Color getColor(){
        return color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==Chose)
        {
            JColorChooser colorChooser = new JColorChooser();
            color = JColorChooser.showDialog(null, "Pick a color", Color.white);
            Chose.setBackground(color);
        }

       else if(e.getSource()==ClearBut) {
            color = Color.white;
        }
    }
}
