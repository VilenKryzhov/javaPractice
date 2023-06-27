package demo1.lesson2.additional2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Book implements Printable {
    String name;
    int Str;

    public void print(){
        System.out.println("Книга - " + name + "на " + Str + " сторінок");
    }
}
