package demo1.lesson2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter

public class HardDrive {
    public String producer;
    public int volume;
     Type  type;


}
     enum Type {
        SSD,
        HDD
    }



