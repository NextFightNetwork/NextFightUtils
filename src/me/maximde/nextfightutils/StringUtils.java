package me.maximde.nextfightutils;

import java.util.Base64;

public class StringUtils {

    public static String encriptString(String string) {
        return Base64.getEncoder().encodeToString(string.getBytes());
    }

    public static String decriptString(String string) {
        byte[] decodedBytes = Base64.getDecoder().decode(string);
        return new String(decodedBytes);
    }
}
