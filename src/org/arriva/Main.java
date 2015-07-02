package org.arriva;

import org.arriva.atimer.gui.GuiWindow;
import org.arriva.atimer.gui.GuiWindowParams;
import org.arriva.atimer.gui.GuiWindowType;

public class Main {

    public static void main(String[] args) {
        GuiWindowParams params = new GuiWindowParams(300, 200);
        GuiWindow window = GuiWindow.buildWindow(GuiWindowType.SIMPLE, params);
        window.setVisible(true);
    }
}
