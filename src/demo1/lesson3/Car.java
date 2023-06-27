package demo1.lesson3;

import lombok.*;

@Data
@NoArgsConstructor

public class Car {
    String model;
    int year;
    int power;


    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

}



