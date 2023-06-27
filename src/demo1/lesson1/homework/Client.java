package demo1.lesson1.homework;

import lombok.*;

import java.util.ArrayList;

@ToString
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode


public class Client {
    private int id;
    private String surname;
    private Long numberPhone;
    private String email;

    private ArrayList<String> goods = new ArrayList<>();


}
//   Створити масив з 10 об'єктів для кожного типу, вивести
//     кожен елемент певного масиву через цикл. для кожного масиву свій цикл
