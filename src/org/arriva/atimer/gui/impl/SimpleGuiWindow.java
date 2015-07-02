package org.arriva.atimer.gui.impl;


import org.arriva.atimer.gui.GuiWindow;
import org.arriva.atimer.gui.GuiWindowParams;
import org.arriva.atimer.gui.TimerTickActionListener;

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
        initTimeLabel();
        initTimer();
        initStartButton();
    }

    private void initTimer() {
        TimerTickActionListener tick = new TimerTickActionListener(5, timeLabel);
        timer = new Timer(1000, tick);
        tick.setTimer(timer);
    }

    private void initTimeLabel() {
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 80));
        timeLabel.setBounds((getWidth() - timeLabel.getWidth()) / 2, (getHeight() - timeLabel.getHeight()) / 2, 100, 60);
    }

    private void initStartButton() {
        start = new JButton("Start");
        start.setBounds(0, 0, 80, 30);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //remove(start);
                add(timeLabel);
                //validate();
                //repaint();
                timer.start();
            }
        });

        add(start);
    }
}
