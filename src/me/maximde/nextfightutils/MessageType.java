package me.maximde.nextfightutils;

import java.awt.*;

public enum MessageType {

    INFO("ⓘ", ColorUtils.mainColor, ColorUtils.mainColorIcon),
    WARNING("⚠", ColorUtils.warningColor, ColorUtils.warningColorIcon),
    NOACCESS("✖", ColorUtils.noAccessColor, ColorUtils.noAccessColorIcon);

    public final String icon;
    public final Color messageColor;
    public final Color iconColor;

    MessageType(String icon, Color messageColor, Color iconColor) {
        this.icon = icon;
        this.messageColor = messageColor;
        this.iconColor = iconColor;
    }
}
