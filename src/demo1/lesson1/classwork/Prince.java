package demo1.lesson1.classwork;

import lombok.*;

import java.util.ArrayList;

//        Створити клас Принц з полями name age , foundedShoe
@ToString
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Prince {
    String name;
    int age;
    int foundedShoe;
    public Adress adress;
    public ArrayList arr;
}
