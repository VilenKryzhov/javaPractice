package demo1.lesson3.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet implements Comparable<Pet> {
    private  String name;
    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.getName());
    }
}
