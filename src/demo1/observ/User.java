package demo1.observ;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class User {
    private String name;
    int id;
    private String typeOfWheels;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void whichTypeOfWheels(int temp) {
        if (temp < 0) {
            this.typeOfWheels = "change wheels to winter type";
            System.out.println(this);
        } else if (temp > 10) {
            this.typeOfWheels = "change wheels to summer type";
            System.out.println(this);
        }
    }
}

class Meteostation {
    int temp;
    List<User> rider;

    public Meteostation() {
        rider = new ArrayList<>();
        rider.add(new User("Vilen",1));
        rider.add(new User("Adnrey",2));
        rider.add(new User("Dasha",3));
        rider.add(new User("Kolya",4));
        rider.add(new User("Aladin",5));
    }
    public void removeRider(User user){
        rider.remove(user);
    }
    public void addRider(){
        rider.add(new User("Angelina", 12));
    }

    public void setTempforWheels(int newTemp){
    this.temp = newTemp;
        for (User user : rider) {
            user.whichTypeOfWheels(temp);
        }
    }

}