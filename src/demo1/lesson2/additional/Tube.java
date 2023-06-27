package demo1.lesson2.additional;

import lombok.*;

@ToString

@Getter
@Setter

public class Tube extends Diameter implements Instrument {
    public Tube() {
    }

    public Tube(int Diameter) {
        super(Diameter);
    }

    public void play(){
        System.out.println("Грає" + " " + this + " "+ "з діаметром" + " " + this.Diameter);
    }

}
