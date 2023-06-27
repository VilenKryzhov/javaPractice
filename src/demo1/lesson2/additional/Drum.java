package demo1.lesson2.additional;


import lombok.*;

@ToString
@Getter
@Setter
public class Drum extends Size implements Instrument {
    public Drum() {
    }

    public Drum(int size) {
        super(size);
    }

    public void play(){
        System.out.println("Грає" + " " + this + " "+ "з барабанами в кількості:" + " " + this.size);
    }
}
