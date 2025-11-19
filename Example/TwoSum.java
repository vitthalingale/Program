package Example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int target = 11;

        for (int i = 0 ; i<a.length;i++){
            for (int j = i+1 ; j<a.length;j++){
                if(a[i] + a[j] == target){
                    System.out.println("indices " + i + " "+j);
                }
            }
        }
        int[] res2 = usingHashMap(a, target);
        System.out.println(Arrays.toString(res2));
    }

    public static int[] usingHashMap(int[] a ,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ;i <a.length;i++){
            int temp  = target - a[i];
            if(map.containsKey(temp)){
                return new int[] {map.get(temp) , i};
            }
            map.put(a[i],i);
        }
        return null;
    }


}
