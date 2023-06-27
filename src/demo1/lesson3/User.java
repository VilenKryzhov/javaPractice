package demo1.lesson3;

import lombok.*;

import java.util.ArrayList;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User>  {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList skill;
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }
}

enum Gender {
    MALE,
    FEMALE
}
