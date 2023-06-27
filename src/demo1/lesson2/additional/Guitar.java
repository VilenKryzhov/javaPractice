package demo1.lesson2.additional;

import lombok.*;

@Getter
@Setter
@ToString


public class Guitar extends SumStrings implements Instrument{
    public Guitar() {
    }

    public Guitar(int SumStrings) {
        super(SumStrings);
    }

    public void play(){
        System.out.println("Грає" + " " + this + " "+ "кількістю струн:" + " " + this.SumStrings);
    }

public void asd(){
        System.out.println("asd");
}
public void asdfsa(){
        System.out.println(2);
}

}
