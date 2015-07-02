package org.arriva.atimer.gui;


import org.arriva.atimer.gui.impl.SimpleGuiWindow;

import javax.swing.*;

public abstract class GuiWindow extends JFrame {

    protected GuiWindow(GuiWindowParams params) {
        initMainWindow(params.getWidth(), params.getHeight());
        buildAndAttachElements();
    }

    public static GuiWindow buildWindow(GuiWindowType type, GuiWindowParams params) {
        switch (type) {
            case SIMPLE:
                return new SimpleGuiWindow(params);
            default:
                return null;
        }
    }

    protected void initMainWindow(int width, int height) {
        setSize(width, height);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected abstract void buildAndAttachElements();
}