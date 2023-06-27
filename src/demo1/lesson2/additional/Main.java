package demo1.lesson2.additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar());
        instruments.add(new Tube());
        instruments.add(new Drum());
        System.out.println(instruments);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
        Guitar guitar =  (Guitar) instruments.get(0);


    }
}
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Интерфейс Инструмент содержит метод play()
//Гитара содержит переменные класса количествоСтрун,
//Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//В цикле вызвать метод play() для каждого инструмента,
//который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

//ArrayList<Instrument> instruments = new ArrayList<>();
//        instruments.add(Guitar);
//        instruments.add(Tube);
//        instruments.add(Drum);