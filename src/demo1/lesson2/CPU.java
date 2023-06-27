package demo1.lesson2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter

public class CPU {
    public String model;
    public int frequency;
    public int generation;
    public String producer;
}
