package Example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {

        // using 2 way java and java 8

        int[] arr ={1,2,3,4,5,6,1,2,3};

        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int n : arr){
            if(!set.add(n)){
                dup.add(n);
            }
        }
        System.out.println("Duplicate number " + dup);

        // call java 8 method
        System.out.println(findTheDuplicateElementUsingJava8(arr));

        //call method using hashnmap
        System.out.println(usingHashMap(arr));

    }
    public static List<Integer> findTheDuplicateElementUsingJava8(int[] arr){

        List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        return res;
    }

    // using HashMap

    public static List<Integer> usingHashMap(int[] arr){

        Map<Integer,Integer> map1 = new HashMap<>();

        for ( int n : arr){
            map1.put(n, map1.getOrDefault(n,0)+1);
        }
        return map1.entrySet().stream().filter( i -> i.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
