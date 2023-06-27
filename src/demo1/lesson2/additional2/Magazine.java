package demo1.lesson2.additional2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Magazine implements Printable {
    String name;
    int Str;

    public void print(){
        System.out.println("Журнал - " + name + "на " + Str + " сторінок");
    }
}