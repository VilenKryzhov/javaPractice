package demo1.lesson4;

import java.util.*;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        List<String> asd = new ArrayList<>();
        asd.add("ball");
        asd.add("pen");
        asd.add("football");
        asd.add("Basketball");
        asd.add("dogger");
        asd.add("telephone");
        asd.add("kukurelia");
        asd.add("ostrog");
        asd.add("kherson");
        asd.add("valuev");
        asd.add("bbabazpatronom");
        asd.add("Lebron");
        asd.add("Neymar");
        asd.add("Car");
        asd.add("Man");
        asd.add("Flowers");
        asd.add("Sun");

        List<String> stream = asd.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
                .filter(new Predicate<String>() {           //- відсортувати його за алфавітом .
                    //*-- відфільтрувати слова довжиною менше 4 символів
                    @Override
                    public boolean test(String s) {
                        return s.length() > 4;
                    }
                })
                .collect(Collectors.toList());
        //  System.out.println(stream);

        int[] num = new int[]{2, 4, 6, 4, 1, 6, 7, 111, 9, 14, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        IntStream sortedArray = Arrays.stream(num);
//        sortedArray.sorted()
//                .filter(new IntPredicate() {
//                    @Override
//                    public boolean test(int value) {
//                        return value % 10 == 0;
//                    }
//                })
//                .map(new IntUnaryOperator() {
//                    @Override
//                    public int applyAsInt(int operand) {
//                        return operand * 3;
//                    }
//                })
////                .forEach(new IntConsumer() {
////                    @Override
////                    public void accept(int value) {
////                        System.out.println(value);
////                    }
////
////                });


    }
}
//-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

//Це абстрактне завдання, в якого ыснуэ 100500 способів вирішення, тому його сприймате просто як список можливих варіацій бізнес процесів.
//Вважайте, що тут нема правильної відповіді

