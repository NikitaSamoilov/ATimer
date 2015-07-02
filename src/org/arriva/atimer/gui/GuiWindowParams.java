package org.arriva.atimer.gui;


public class GuiWindowParams {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public GuiWindowParams() {
        width = 400;
        height = 300;
    }

    public GuiWindowParams(int width, int height) {
        setHeight(height);
        setHeight(width);
    }

}
