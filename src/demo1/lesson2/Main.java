package demo1.lesson2;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("virtus",2,4,"Aloha");
        Motherboard motherboard = new Motherboard("ASUS","Avalon");
        Ram ram = new Ram(6,"Lister","GTX", 4);
        Type current1 = Type.SSD;
        Type current2 = Type.HDD;
        HardDrive harddrive = new HardDrive("Sanik",3,current2);
        HardDrive harddrive2 = new HardDrive("Sanik12",32,current2);
        PC pc = new PC("asd",cpu,motherboard,ram,harddrive,harddrive2);
        System.out.println(pc);
        pc.changeVolumeRam(3);
        System.out.println(ram);
        pc.changeFraquencyCPU(2);
        System.out.println(cpu);





    }
}
//Делегувати до PC можливість зміни всіх характеристик складових частин
// (приклад: PC повинен мати методи які змінюють volume в Ram, frequency в CPU і тд)
//Описати наступну структуру:
//PC
//    string model
//    CPU cpu
//    Motherboard motherboard
//    Ram ram
//    HardDrive hard
//
//
//CPU
//    string model
//    int frequency
//    int generation
//    string producer
//
//Motherboard
//    model
//    string producer
//
//Ram
//    int volume
//    string producer
//    string model
//    int frequency
//
//HardDrive
//    string producer
//    int volume
//    enum Type (ssd / hdd)
//
