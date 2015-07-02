package org.arriva;

import org.arriva.atimer.gui.GuiWindow;
import org.arriva.atimer.gui.GuiWindowParams;
import org.arriva.atimer.gui.GuiWindowType;

public class Main {

    public static void main(String[] args) {
        GuiWindowParams params = new GuiWindowParams(600, 500);
        GuiWindow window = GuiWindow.buildWindow(GuiWindowType.SIMPLE, params);
        window.setVisible(true);
    }
}
