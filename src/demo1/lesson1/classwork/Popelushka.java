package demo1.lesson1.classwork;

import lombok.*;

//Створити клас Попелюшка з полями name,age,footSize
@ToString
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Popelushka {
    String name;
    int age;
    int footSize;
}
