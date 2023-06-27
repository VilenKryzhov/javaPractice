package demo1.training;

public class setAlarm {
    static boolean real;
    public static boolean setAlarmFunc(boolean employed, boolean vacation) {

        if (employed && vacation){
            real = false;
        } else if (!employed && vacation) {
            real = false;
        } else if (!employed && !vacation) {
            real = false;
        } else if (employed && !vacation) {
            real = true;
        }
        return real; }
}
