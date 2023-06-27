package demo1.training;

public class TrafficLight {
    public static String TrafficLightFunc(String color){
        if (color.equals("green")){
             return "yellow";
        } else if (color == "yellow") {
             return "red";
        } else if (color == "red" ) {
            return "green";
        }
    return color;}
}
