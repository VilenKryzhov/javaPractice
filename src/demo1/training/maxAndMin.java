package demo1.training;

import java.util.Arrays;

public class maxAndMin {
    public static String maxAndMinFunc(String arr){
        String[] array = arr.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
    }
}
