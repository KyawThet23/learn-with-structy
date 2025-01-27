package arrayAndString;

import java.util.HashMap;
import java.util.List;

public class pairProduct {

    public static void main(String[] args) {
        System.out.println(findPairProduct(List.of(1,2,3,4) , 12));
    }

    public static List<Integer> findPairProduct(List<Integer> nums , int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for (int i : nums){
            int pair = target / i;
            if(map.containsKey(pair)){
                return List.of(map.get(pair) , i);
            }
            map.put(i , index);
            index++;
        }
        return null;
    }
}
