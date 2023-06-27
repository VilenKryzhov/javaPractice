package demo1.lesson3;

import lombok.*;

@Data

@NoArgsConstructor

public class Skills {
    String title;
    int exp;

    public Skills(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }
}
