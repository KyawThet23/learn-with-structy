package arrayAndString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersection {

    public static void main(String[] args) {
        System.out.println(intersection(List.of(1,2,3,4),List.of(3,4,5,6)));
    }

    public static List<Integer> intersection(List<Integer> list1 , List<Integer> list2){

        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(list2);

        for (int ele : list1){
            if(set.contains(ele)){
                result.add(ele);
            }
        }

        return result;
    }
}
