package demo1.observ;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Data {
    public static void main(String[] args) {

//        Meteostation meteostation = new Meteostation();
//        meteostation.setTempforWheels(-10);

//        interface1 a = new interface1() {
//            @Override
//            public void aPlusB(int a, int b) {
//                int x = a + b;
//                System.out.println(x);
//            }
//        };
//        a.aPlusB(4,2);
//        interface1.aMinusB(17,5);
//        if (2>1){
//            interface1.aMinusB(90,13);
//            a.aPlusB(2,5);
//        }

        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                String[] x = new String[]{array[i][j]};
                for (String strings : x) {
                    System.out.println(strings);
                }
            }

    }
};
