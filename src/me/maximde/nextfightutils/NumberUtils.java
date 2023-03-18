package me.maximde.nextfightutils;

/**
 * Collection of utils
 */
public class NumberUtils {

    /**
     * Example:
     * 10.000 = 10K,
     * 1.000.000 = 1M,
     * 1.000.000.000 = 1B
     * @param number (For example followers or likes)
     */
    public static String shortenNumber(int number) {
        String result = number+"";
        if(number >= 10000) {
            result = (number/1000) + "K";
        }
        if(number >= 1000000) {
            result = (number/1000000) + "M";
        }
        if(number >= 1000000000) {
            result = (number/1000000000) + "B";
        }
        return result;
    }
}
