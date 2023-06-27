package demo1.lesson2;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Ram {
   public int volume;
   public String producer;
   public String model;
   public int frequency;
}
