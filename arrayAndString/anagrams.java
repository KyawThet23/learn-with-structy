package arrayAndString;

import java.util.HashMap;

public class anagrams {

//    anagrams ဆိုတာ ပါဝင်တဲ့ စာလုံးတွေတူတဲ့ စကားစု နှစ်ခုကို ခေါ်ဆိုတာဖြစ်ပြီး
//    အစဉ်အတိုင်း ြဖစ်စရာတော့ မလိုပါဘူး ။
//    အဲ့တော့ စကားစု အလိုက် စာလုံး တစ်လုံးခြင်းစီရဲ့ အရေအတွက်ကို Map ထဲမှာ
//    key and value ကို ထည််ပြီး တိုက်စစ်လိုက်ရင် အဖြေကို ရပါပြီ ။

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "leloH";
        System.out.println(isAnagrams(s1,s2));
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

    public static boolean isAnagrams (String s1 , String s2) {
        HashMap<Character,Integer> count1 = charCount(s1);
        HashMap<Character,Integer> count2 = charCount(s2);
        return count1.equals(count2);
    }
}
