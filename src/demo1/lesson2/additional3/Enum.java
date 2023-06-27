package demo1.lesson2.additional3;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Enum {
    public int euroSize;
     public Size size;

}
enum Size {
    XXS,
    XS,
    S,
    M,
    L
}