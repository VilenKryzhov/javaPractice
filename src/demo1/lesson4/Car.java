package demo1.lesson4;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public  class Car   {
    private String mark;
    private int horse;
    Owner owner;
    private int price;
    private int year;

    public void developHorse() {
        this.horse = getHorse() + 50;
    }

    public void addYear() {
        this.year = getYear() + 1;
    }




}


