package me.maximde.nextfightutils;

import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.URL;

public class IPUtils {

    public static String getCountry(String ip) {
        return (getString("http://ip-api.com/json/" + ip, "country"));
    }

    public static String getRegion(String ip) {
        return (getString("http://ip-api.com/json/" + ip, "regionName"));
    }

    public static String getCity(String ip) {
        return (getString("http://ip-api.com/json/" + ip, "city"));
    }

    public static String getNumericIP(String ip) {
        return (getString("http://ip-api.com/json/" + ip, "query"));
    }

    public static boolean isProxy(String ip) {
        return getBoolean("http://ip-api.com/json/" + ip + "?fields=131072", "proxy");
    }

    private static String getString(String url, String fieldName) {
        try {
            URL linkUrl = new URL(url);
            InputStreamReader reader = new InputStreamReader(linkUrl.openStream());
            return new JsonParser().parse(reader).getAsJsonObject().get(fieldName).getAsString();
        } catch (Exception e) {
            return "Failed!";
        }
    }

    private static boolean getBoolean(String url, String fieldName) {
        try {
            URL linkUrl = new URL(url);
            InputStreamReader reader = new InputStreamReader(linkUrl.openStream());
            return new JsonParser().parse(reader).getAsJsonObject().get(fieldName).getAsBoolean();
        } catch (Exception e) {
            return false;
        }
    }
}
