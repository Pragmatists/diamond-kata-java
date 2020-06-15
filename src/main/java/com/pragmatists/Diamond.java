package com.pragmatists;

public class Diamond {

    public static String print(char letter) {
        int diamondSize = letter - 'A';
        return spaces(diamondSize) + "A" + spaces(diamondSize);
    }

    private static String spaces(int count) {
        return "-".repeat(count);
    }
}
