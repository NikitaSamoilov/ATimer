package org.arriva.atimer.gui.impl;


import org.arriva.atimer.gui.GuiWindow;
import org.arriva.atimer.gui.GuiWindowParams;
import org.arriva.atimer.gui.TimerTick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiWindow extends GuiWindow {

    private JLabel timeLabel;
    private Timer timer;
    private JButton start;

    public SimpleGuiWindow(GuiWindowParams params) {
        super(params);
    }

    @Override
    protected void buildAndAttachElements() {
        setLayout(new FlowLayout());
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Monospaced", Font.BOLD, 80));
        TimerTick tick = new TimerTick(5, timeLabel);
        timer = new Timer(1000, tick);
        tick.setTimer(timer);
        start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //remove(start);
                add(timeLabel);
                validate();
                repaint();
                timer.start();
            }
        });

        add(start);
        setPreferredSize(new Dimension(300, 150));
        setLocationRelativeTo(null);
        pack();
    }
}
