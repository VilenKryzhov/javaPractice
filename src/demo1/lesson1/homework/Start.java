package demo1.lesson1.homework;
//Створити класи з полями
//        Animal: кличка, вік, тип тварини
//        Book: назва, кількість сторінок, жанр, дата випуску
//        Client : ід, ім'я прізвище, телефон, пошта, замовлення(масив товарів, стрінгові назви)
//       Створити масив з 10 об'єктів для кожного типу, вивести кожен елемент певного масиву через цикл.
//        для кожного масиву свій цикл//

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import demo1.lesson1.homework.Animal;
import demo1.lesson1.homework.Book;
import demo1.lesson1.homework.Client;
import sun.awt.geom.AreaOp;
import sun.java2d.DisposerTarget;

import java.util.ArrayList;
import java.util.Objects;

public class Start {
    public static void main(String[] args) {


        ArrayList<String> goods1 = new ArrayList<>();
        //       goods1.add("milk");
        //       goods1.add("chocolate");
        goods1.add("meet");
        goods1.add("meet2");
        goods1.add("meet3");
        goods1.add("meet4");
        goods1.add("meet5");
        goods1.add("meet6");
        goods1.add("meet7");
        goods1.add("meet8");
//        Animal animal1 = new Animal("Leopard", 23, "asd");
//        Client clientList = new Client(1, "Kryzhov", +38096901229L, "@gmail", goods1);

        //       for (String goodsList : goods1) {
        //           System.out.println(goodsList);
        //       }

        //      int [] numberList = new int[10];
        //      numberList[0] = 1;
        //      numberList[1] = 12;
        //      numberList[2] = 13;
        //      numberList[3] = 14;
        //      numberList[4] = 15;
        //      numberList[5] = 167;

        //      for (int i = 0; i < numberList.length; i++) {
        //          int number = numberList[i];
        //          System.out.println(number);
        //      }
        Animal[] arrayAnimal = new Animal[5];
        arrayAnimal[0] = new Animal("Dog", 12, "gepa",20);
        arrayAnimal[1] = new Animal("Cat", 1322, "gepasd",20);
        arrayAnimal[2] = new Animal("Dog2", 122, "geasdpa",20);
        arrayAnimal[3] = new Animal("Dog5", 122, "gepa",20);
        arrayAnimal[4] = new Animal("Cat5", 112, "gepa",20);
        arrayAnimal[0].age = arrayAnimal[0].age + 2;
        System.out.println(arrayAnimal[0].age);
        arrayAnimal[4].changeSpeed(4);
        System.out.println(arrayAnimal[4]);


        for (Animal animal : arrayAnimal) {
            animal.setName("May");
            System.out.println(animal);
        }


        Client[] clientListNew = new Client[5];
        clientListNew[0] = new Client(1, "qwe1", 234234L, "@asdasf", goods1);
        clientListNew[1] = new Client(2, "qwe2", 234234L, "@asdasf", goods1);
        clientListNew[2] = new Client(3, "qwe3", 234234L, "@asdasf", goods1);
        clientListNew[3] = new Client(4, "qwe4", 234234L, "@asdasf", goods1);
        clientListNew[4] = new Client(5, "qwe5", 234234L, "@asdasf", goods1);
        for (Client client : clientListNew) {
            System.out.println(client);

        }

    }

}

