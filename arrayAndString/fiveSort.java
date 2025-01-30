package arrayAndString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fiveSort {

    public static void main(String[] args) {
        System.out.println(solution(List.of(1,2,3,4,5,6,5,5,7)));
    }

    public static List<Integer> solution(List<Integer> list){

        List<Integer> result = new ArrayList<>(list);
        int index1 = 0;
        int index2 = list.size() - 1;

        while (index2 > index1){
            if(list.get(index2) == 5){
                index2--;
            } else if (list.get(index1) != 5) {
                index1++;
            } else {
                Collections.swap(result , index1 , index2);
                index1++;
                index2--;
            }
        }

        return result;
    }
}
