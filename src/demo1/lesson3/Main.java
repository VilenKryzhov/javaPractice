package demo1.lesson3;


import java.util.*;


public class Main {
    public static void main(String[] args) {


        Skills user1Skill1 = new Skills("java", 10);
        Skills user1Skill2 = new Skills("phyton", 7);
        Skills user1Skill3 = new Skills("C++", 12);

        ArrayList<Skills> user1Skill = new ArrayList<>();
        user1Skill.add(user1Skill1);
        user1Skill.add(user1Skill2);
        user1Skill.add(user1Skill3);


        Skills user2Skill1 = new Skills("javascript", 2);
        Skills user2Skill2 = new Skills("C++", 3);
        Skills user2Skill3 = new Skills("html", 16);

        ArrayList<Skills> user2Skill = new ArrayList<>();
        user2Skill.add(user2Skill1);
        user2Skill.add(user2Skill2);
        user2Skill.add(user2Skill3);


        Skills user3Skill1 = new Skills("html", 21);
        Skills user3Skill2 = new Skills("react", 23);
        Skills user3Skill3 = new Skills("angular", 36);

        ArrayList<Skills> user3Skill = new ArrayList<>();
        user3Skill.add(user3Skill1);
        user3Skill.add(user3Skill2);
        user3Skill.add(user3Skill3);


        Skills user4Skill1 = new Skills("angular", 1);
        Skills user4Skill2 = new Skills("react", 3);
        Skills user4Skill3 = new Skills("html", 6);

        ArrayList<Skills> user4Skill = new ArrayList<>();
        user4Skill.add(user4Skill1);
        user4Skill.add(user4Skill2);
        user4Skill.add(user4Skill3);


        Skills user5Skill1 = new Skills("java", 21);
        Skills user5Skill2 = new Skills("QA", 7);
        Skills user5Skill3 = new Skills("JS", 14);

        ArrayList<Skills> user5Skill = new ArrayList<>();
        user5Skill.add(user5Skill1);
        user5Skill.add(user5Skill2);
        user5Skill.add(user5Skill3);

        Car ivanCar = new Car("tesla", 2020, 220);

        Car dimaCar = new Car("bmw", 2022, 350);

        Car dashaCar = new Car("mercedes-benz", 2015, 180);

        Car oksanaCar = new Car("fiat", 2011, 130);

        Car petyaCar = new Car("kia", 2009, 150);


        User Ivan = new User(1, "Ivan", "Kryzhov", "asd@gmail.com1", 22, Gender.MALE, user1Skill, ivanCar);
        User Dima = new User(2, "Dima", "Lazuren", "asd@gmail.com2", 23, Gender.MALE, user2Skill, dimaCar);
        User Dasha = new User(3, "Dasha", "Kryzhova", "asd@gmail.com3", 30, Gender.FEMALE, user3Skill, dashaCar);
        User Oksana = new User(4, "Oksana", "Kryzhova", "asd@gmail.com4", 31, Gender.FEMALE, user4Skill, oksanaCar);
        User Petya = new User(5, "Petya", "Lazurin", "asd@gmail.com5", 20, Gender.MALE, user5Skill, petyaCar);

//        HashSet<User> userList = new HashSet<>();
//        userList.add(Ivan);
//        userList.add(Dima);
//        userList.add(Dasha);
//        userList.add(Oksana);
//        userList.add(Petya);
//
//        Iterator <User> iteratorUser = userList.iterator();
//        while (iteratorUser.hasNext()){
//            User next =  iteratorUser.next();
//            if (next.getGender() == Gender.MALE){
//            iteratorUser.remove();
//            }
//        }
//        System.out.println(userList);
//        for (User user : userList) {
//            System.out.println(user);
//
//        }


        TreeSet <User> treeSetUser = new TreeSet<>();
        treeSetUser.add(Ivan);
        treeSetUser.add(Dima);
        treeSetUser.add(Dasha);
        treeSetUser.add(Oksana);
        treeSetUser.add(Petya);

        Iterator<User> it = treeSetUser.iterator();
        while (it.hasNext()){
            User next1 = it.next();
            if (next1.getId() % 2 == 1){
                System.out.println(next1);
            }
        }

//        System.out.println(treeSetUser);
//        for (User user : treeSetUser) {
//            System.out.println(user);
//        }
//       System.out.println(treeSetUser.size());




    }
}
//Створити клас котрий відповідає наступній моделі
//{
//    id: 1,
//    name: 'vasya',
//    surname: 'pupkin',
//    email: 'asd@asd.com',
//    age: 31,
//    gender: 'MALE',
//    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//    car: {model: 'toyota', year: 2021, power: 250}
//}

//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого