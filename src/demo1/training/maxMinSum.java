package demo1.training;

import java.util.Arrays;

public class maxMinSum {
    public static int max(int[] list) {
        int a = Arrays.stream(list).max().getAsInt();
        return a;
    }

    public static int min(int[] list) {
        int b = Arrays.stream(list).min().getAsInt();
        return b;
    }
}

