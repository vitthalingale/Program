package Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,5,0,6,8,9,47};
        System.out.println(moveZerotoEnd(arr));

    }

    public static List<Integer> moveZerotoEnd(int[] arr){

        List<Integer>  num = Arrays.stream(arr).boxed().filter(i -> i != 0).collect(Collectors.toList());
        List<Integer> zero = Arrays.stream(arr).boxed().filter(i -> i == 0).collect(Collectors.toList());

        num.addAll(zero);
        return num;

    }
}
