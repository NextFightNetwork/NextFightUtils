package me.maximde.nextfightutils;

public class LevelHandler {
    public static int XPtoLevel(double xp) {
        return (int)getLevelFromExp((long)xp);
    }

    public static double getLevelFromExp(long exp) {
        if (exp > 1395L)
            return (Math.sqrt((72L * exp - 54215L)) + 325.0D) / 18.0D;
        if (exp > 315L)
            return Math.sqrt((40L * exp - 7839L)) / 10.0D + 8.1D;
        if (exp > 0L)
            return Math.sqrt((exp + 9L)) - 3.0D;
        return 0.0D;
    }

    public static int getExpFromLevel(int level) {
        if (level > 30)
            return (int)(4.5D * level * level - 162.5D * level + 2220.0D);
        if (level > 15)
            return (int)(2.5D * level * level - 40.5D * level + 360.0D);
        return level * level + 6 * level;
    }

    public static long getExpMissingToNextLevel(long xp) {
        int level = (int)getLevelFromExp(xp);
        level++;
        long xpFromNextLevel = getExpFromLevel(level);
        return xpFromNextLevel - xp;
    }

    public static long getExpDoneToNextLevel(long xp) {
        int level = (int)getLevelFromExp(xp);
        int xpFromThisLevel = getExpFromLevel(level);
        return xp - xpFromThisLevel;
    }

    public static int getExpToNext(int level) {
        if (level > 30)
            return 9 * level - 158;
        if (level > 15)
            return 5 * level - 38;
        return 2 * level + 7;
    }
}
