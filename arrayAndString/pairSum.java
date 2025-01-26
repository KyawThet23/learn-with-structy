package arrayAndString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pairSum {

    public static void main(String[] args) {
        System.out.println(findPairSum(List.of(1,2,3,4,5),6));
    }

    public static List<Integer> findPairSum(List<Integer> numbers , int source){

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int pair = source - numbers.get(i);
            if(map.containsKey(pair)) {
                return List.of(map.get(pair), i);
            }
            map.put(numbers.get(i),i);
        }
        return null;
    }
}
