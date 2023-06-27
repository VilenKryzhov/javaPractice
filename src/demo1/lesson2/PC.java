package demo1.lesson2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class PC {
    String model;
    CPU cpu;
    public Motherboard motherboard;
    public Ram ram;
    public HardDrive harddrive;
    public HardDrive harddrive2;

    public void changeVolumeRam(int x){
        ram.volume = x;
    }
    public void changeFraquencyCPU (int x){
        cpu.frequency = cpu.frequency - x;
    }


}
