package demo1.lesson4;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main2 {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Ivan", 23, 4);
        Owner owner2 = new Owner("Dasha", 25, 6);
        Owner owner3 = new Owner("katya", 43, 3);
        Owner owner4 = new Owner("Dima", 23, 4);
        Owner owner5 = new Owner("Kolya", 24, 8);
        Owner owner6 = new Owner("Ivan", 32, 2);
        Owner owner7 = new Owner("Albert", 18, 1);
        Owner owner8 = new Owner("Stas", 20, 2);

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("BMW", 250, owner1, 22500, 2020));
        carList.add(new Car("BMWX5", 320, owner2, 45000, 2023));
        carList.add(new Car("Mercedes-BenzA180", 150, owner3, 15000, 2018));
        carList.add(new Car("Mercedes_BenzS", 320, owner4, 30000, 2019));
        carList.add(new Car("AudiA6", 320, owner5, 31000, 2023));
        carList.add(new Car("AudiA7", 450, owner6, 44000, 2023));
        carList.add(new Car("Toyota", 220, owner7, 33000, 2017));
        carList.add(new Car("Kia", 170, owner8, 20000, 2015));
        carList.add(new Car("Mazda", 120, owner3, 17000, 2017));
        carList.add(new Car("Kia3", 110, owner2, 14000, 2014));
//        int a = 0;
//        for (Car car : carList) {
//              a+= car.getPrice();
//        };
//        System.out.println(a);


        
//        int a = 0;
//        Iterator<Car> iterator = carList.iterator();
//        while (iterator.hasNext()){
//            Car next = iterator.next();
//            int inter = next.getPrice();
//            a += inter;
//
//        }
//        System.out.println(a);


//        Stream<Car> stream = carList.stream();
//        List<Car> collect = stream
//
//                .filter(car -> car.getHorse() <= 200)
//                .collect(Collectors.toList());
//
//
//
//
//        for (Car car : collect) {
//            car.developHorse();
////            System.out.println(car);
//
//        }
//        Stream<Car> carStream = collect.stream();
//        List<Car> yearUp = carStream
//                .filter(car -> car.owner.drivinExperience < 5 && car.owner.getAge()>25)
//                .collect(Collectors.toList());
//
//        for (Car car : yearUp) {
//            car.addYear();
//            System.out.println(car);
//        }
//        int sum = 0;
//        for (Car car : carList) {
//            sum += car.getPrice();
//
//        }
//        System.out.println(sum);
//
    }



}
//Створити клас автомобіля з полями:
//Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля теж має бути обєкт, у якого є поля
//Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
//Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API
