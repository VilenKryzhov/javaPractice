package demo1.lesson2.additional2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 182);
        Magazine magazine = new Magazine("Vogue", 38);
        ArrayList<Printable> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(magazine);
        System.out.println(bookList);
    }

}
//а) Определить интерфейс Printable, содержащий метод void print().
//б) Определить класс Book, реализующий интерфейс Printable.
//в) Определить класс Magazine, реализующий интерфейс Printable.
//г) Создать массив типа Printable, который будет содержать книги и журналы.


