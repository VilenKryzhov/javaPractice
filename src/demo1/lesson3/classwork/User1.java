package demo1.lesson3.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User1 implements Comparable<User1> {
    private String name;

    @Override
    public int compareTo(User1 o) {
        return this.name.compareTo(o.getName());
    }
}
