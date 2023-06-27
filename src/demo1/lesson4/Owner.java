package demo1.lesson4;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Owner {
    public String name;
    public int age;
    public int drivinExperience;

    public Owner(String name, int age, int drivinExperience) {
        this.name = name;
        this.age = age;
        this.drivinExperience = drivinExperience;
    }
}
