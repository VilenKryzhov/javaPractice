package demo1.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Trainings {
    public static int QuarterOf(int month) {
        if (1 <= month && month <= 3) {
            return 1;
        } else if (4 <= month && month <= 6) {
            return 2;
        } else if (7 <= month && month <= 9) {
            return 3;
        } else if (10 <= month && month <= 12) {
            return 4;
        }
        return month;
    }


    public static int DubleNum(int[] arr) {
        return Arrays.stream(arr).map(operand -> operand * 2).sum();
    }


    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;     // знайти середнє число масиву і зрівняти його з своїм числом
    }




    static List<Integer> plusNum = new ArrayList<>();
    static int a;
    static int b;
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int count = 0;
        int sum = 0;
        for (int i : input) {
            if (i > 0) {
                count++;
            } else if (i < 0) {
                sum += i;
            }

        }
        return new int[]{count, sum};}}



