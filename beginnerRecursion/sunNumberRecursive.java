package beginnerRecursion;

import java.util.List;

// recursive နဲ့ ဖြေရှင်းပေမယ့် iterative နဲ့လည်း သွားလို့ရတယ် ။ Mathematics နဲ့လည်း ရတယ် ။

public class sunNumberRecursive {

    public static void main(String[] args) {
        System.out.println(recursive(List.of(1,2,3,4,5) , 0));
        System.out.println(iterative(List.of(1,2,3,4,5)));
        System.out.println(maths(List.of(1,2,3,4,5)));
    }

    public static int recursive(List<Integer> list , int index){
        if(index >= list.size()){
            return 0;
        }
        return list.get(index) + recursive(list,index+1) ;
    }

    public static int iterative(List<Integer> list){
        int result = 0;
        for (int i : list) {
            result += i;
        }
        return result;
    }

    public static int maths(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum() ;
    }

}
