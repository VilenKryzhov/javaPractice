package demo1.thread;

import org.w3c.dom.css.Counter;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(Arrays.stream(array1)
                .filter(aBoolean -> aBoolean.equals(true))
                .count());
    }
}
