package me.maximde.nextfightutils;

import net.md_5.bungee.api.ChatColor;

public class NFM {
    public static String m(String message, MessageType type) {
        return ChatColor.of(type.iconColor) + type.icon + " " + ChatColor.of(type.messageColor) + message;
    }
}
