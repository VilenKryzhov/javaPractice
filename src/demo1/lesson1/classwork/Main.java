package demo1.lesson1.classwork;

import java.util.ArrayList;

//Створити клас Попелюшка з полями name,age,footSize
//        Створити клас Принц з полями name age , foundedShoe
//        Свторити один об'єкт класу принц, та масив з 10 попелюшок.
//        Проітерувати масив, та знайти яка попелюшка підходить принцу//
public class Main {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Rivne", 23);
        ArrayList<Popelushka> arr = new ArrayList<>();
        arr.add(new Popelushka("asd",12,23));
        Prince prince = new Prince("Vilen", 23, 35, adress1, arr);
        System.out.println(prince);

    }
}
