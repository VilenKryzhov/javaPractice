package demo1.training;



public class SumArray {
    public static int sumArr(int[] arr){
        int a = 0;
        for (int i : arr) {
            if (i > 0){
                a += i;
            }
            
        }
    return a;
    }

}
