package demo1.lesson2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Motherboard {
    public String model;
    public String producer;
}
