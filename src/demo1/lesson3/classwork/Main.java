package demo1.lesson3.classwork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> asd = new ArrayList<>();
        asd.add("ball");
        asd.add("pen");
        asd.add("football");
        asd.add("Basketball");
        asd.add("dogger");
        asd.add("telephone");
        asd.add("kukurelia");
        asd.add("ostrog");
        asd.add("kherson");
        asd.add("valuev");
        asd.add("bbabazpatronom");
        asd.add("nani");

//        Collections.sort(asd);  -- сортировка в алфавитном
//        System.out.println(asd);

//        Collections.reverse(asd); -- сортировка в обратном по алфавите
//        System.out.println(asd);

//        Iterator <String> i = strings.iterator();
//        while (i.hasNext()){
//            String next = i.next();
//                                                         // отфильтровать слова длиной менее 4х символов
//            if (next.length() <= 4){
//                System.out.println(next);
//            }
//        }
        User Vilen = new User("Vilen", 23);
        User Dasha = new User("DashaKryzhova", 23);
        User Katya = new User("KatyaShepachova", 45);
        User Oksana = new User("Oksana", 44);
        User Mia = new User("Mia", 1);
        ArrayList<User> user = new ArrayList<>();
        user.add(Vilen);
        user.add(Dasha);
        user.add(Katya);
        user.add(Oksana);
        user.add(Mia);

//        Collections.sort(user, new Comparator<User>() {
//            @Override
//            public int compare(User o, User o1) {
//                return o.age - o1.getAge();          --- відсортувати  за  віком (зростання , а потім окремо спадання)
//            }
//        });
//        System.out.println(user);

//        Collections.sort(user, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o2.getName().length() -  o1.name.length() ; --- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//            }
//        });
//        System.out.println(user);


User1 user1 = new User1("Vilen");
Pet dog = new Pet("matiz");
Pet cat = new Pet("sharik");
ArrayList<Pet> pets = new ArrayList<>();
pets.add(dog);
pets.add(cat);
TreeMap<User1, List<Pet>> club = new TreeMap<>();
club.put(user1,pets);
Set<Map.Entry<User1, List<Pet>>> entries = club.entrySet();
Iterator<Map.Entry<User1, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<User1, List<Pet>> next =  iterator.next();

            if (next.getValue().size() == 2){
                System.out.println("Onlu one key in TreeSet");
            }








            }

        }


    }


//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
// В мейн методі створити меню, яке буде реалізовувати наступні функції:
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//6) вивести на екран зооклуб.
//

