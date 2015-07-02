package org.arriva.atimer.gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTick implements ActionListener {
    private int countdown = 10;
    private JLabel timerLabel;
    private Timer timer;

    public int getCurrentCountdown() {
        return countdown;
    }

    public JLabel getTimerLabel() {
        return timerLabel;
    }

    public void setTimerLabel(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public TimerTick(int startCount, JLabel timerLabel) {
        countdown = startCount;
        this.timerLabel = timerLabel;
        this.timer = timer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        countdown -= 1;
        timerLabel.setText(String.valueOf(countdown));
        if (countdown == 0) {
            timer.stop();
            timerLabel.setText("START!");
        }
    }
}
