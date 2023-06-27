package demo1.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int id;
    String name;

    private void sumNum(int a, int b){
        int x = a+b;
        System.out.println(x);
    }
}
