package arrayAndString;

import java.util.HashMap;

public class mostFrequentChar {

    public static void main(String[] args) {
        String s = "freeze";
        System.out.println(findChar(s));
    }

    public static HashMap<Character,Integer> charCount(String s){

        HashMap<Character,Integer> count = new HashMap<>();
        for (char c : s.toCharArray()){
            if (count.get(c) == null){
                count.put(c,0);
            }
            count.put(c , count.get(c) + 1);
        }
        return count;
    }

    public static char findChar(String s){

        HashMap<Character,Integer> count = charCount(s);
        char result = '\0';
        for (char c : s.toCharArray()){
            if (result == '\0' || count.get(c) > count.get(result) ){
                result = c;
            }
        }
        return result;
    }
}
