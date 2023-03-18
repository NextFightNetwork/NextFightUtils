package me.maximde.nextfightutils;

import java.awt.*;

public class ColorUtils {
    public static Color[] generateColorsFadeInAndOut(Color startColor, Color endColor, int numColors) {
        Color[] colors = new Color[numColors];
        float[] startHSB = Color.RGBtoHSB(startColor.getRed(), startColor.getGreen(), startColor.getBlue(), null);
        float[] endHSB = Color.RGBtoHSB(endColor.getRed(), endColor.getGreen(), endColor.getBlue(), null);
        float hueDiff = endHSB[0] - startHSB[0];
        float saturationDiff = endHSB[1] - startHSB[1];
        float brightnessDiff = endHSB[2] - startHSB[2];
        int midIndex = numColors / 2;
        for (int i = 0; i < midIndex; i++) {
            float hue = startHSB[0] + hueDiff * i / (midIndex - 1);
            float saturation = startHSB[1] + saturationDiff * i / (midIndex - 1);
            float brightness = startHSB[2] + brightnessDiff * i / (midIndex - 1);
            colors[i] = new Color(Color.HSBtoRGB(hue, saturation, brightness));
        }
        for (int i = midIndex; i < numColors; i++) {
            float hue = endHSB[0] - hueDiff * (i - midIndex) / (numColors - midIndex - 1);
            float saturation = endHSB[1] - saturationDiff * (i - midIndex) / (numColors - midIndex - 1);
            float brightness = endHSB[2] - brightnessDiff * (i - midIndex) / (numColors - midIndex - 1);
            colors[i] = new Color(Color.HSBtoRGB(hue, saturation, brightness));
        }
        return colors;
    }

    public static Color[] generateColors(Color startColor, Color endColor, int numColors) {
        Color[] colors = new Color[numColors];
        float[] startHSB = Color.RGBtoHSB(startColor.getRed(), startColor.getGreen(), startColor.getBlue(), null);
        float[] endHSB = Color.RGBtoHSB(endColor.getRed(), endColor.getGreen(), endColor.getBlue(), null);
        float hueDiff = endHSB[0] - startHSB[0];
        float saturationDiff = endHSB[1] - startHSB[1];
        float brightnessDiff = endHSB[2] - startHSB[2];
        for (int i = 0; i < numColors; i++) {
            float hue = startHSB[0] + hueDiff * i / (numColors - 1);
            float saturation = startHSB[1] + saturationDiff * i / (numColors - 1);
            float brightness = startHSB[2] + brightnessDiff * i / (numColors - 1);
            colors[i] = new Color(Color.HSBtoRGB(hue, saturation, brightness));
        }
        return colors;
    }

    /**
     * NEXTFIGHT NETWORK STUFF
     */
    public static final Color mainColor = new Color(186, 77, 5);
    public static final Color mainColorIcon = new Color(187, 103, 48);
    public static final Color secondMainColor = new Color(186, 141, 5);
    public static final Color accentColor = new Color(120, 5, 186);
    public static final Color warningColor = new Color(186, 34, 5);
    public static final Color noAccessColor = new Color(186, 5, 5);

    public static final Color warningColorIcon = new Color(183, 72, 52);
    public static final Color noAccessColorIcon = new Color(190, 54, 54);
    public static final Color greenColor = new Color(94, 186, 5);
    public static final Color neutralMainColor = new Color(175, 175, 175);

    public static final Color offlineColor = new Color(255, 68, 32);
    public static final Color onlineColor = new Color(156, 255, 60);
}
