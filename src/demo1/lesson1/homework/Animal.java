package demo1.lesson1.homework;

import lombok.*;

@ToString
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Animal {
    public String name;
    public int age;
    public String type;
    public int speed;

    public void changeSpeed(int x){
        this.speed = this.speed - x;
    }
}

