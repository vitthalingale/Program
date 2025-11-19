package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIndTheCommonElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,6,7,8};

        List<Integer> num = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> res =Arrays.stream(b).boxed().filter(i ->num.contains(i)).collect(Collectors.toList());
        System.out.println(res);

    }

}
