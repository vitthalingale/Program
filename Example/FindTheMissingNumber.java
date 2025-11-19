package Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheMissingNumber {

    public static void main(String[] args) {

        // 2 way using java and java 8

        // first way using java
        int[] arr = {1,2,4,5};

        int n= arr.length+1;

        int expectedSum = n * (n+1)/2;
        int actualSum = Arrays.stream(arr).sum();
        int missingNumber = expectedSum - actualSum;
        System.out.println("missing number + "+missingNumber);

        // call the method
        System.out.println(missingNumberUsingJava8(arr));

    }

    // java 8

    public static List<Integer> missingNumberUsingJava8(int[] arr){

        List<Integer> num = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> res = IntStream.rangeClosed(1, 5).boxed().filter(i -> !num.contains(i)).collect(Collectors.toList());
        return res;
    }
}

