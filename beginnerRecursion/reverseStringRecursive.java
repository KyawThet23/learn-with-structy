package beginnerRecursion;

public class reverseStringRecursive {
    
    public static void main(String[] args) {
        System.out.println(solution("olleH"));
    }

    private static String solution(String text){
       
        int index = text.length() - 1;
        
        if(index < 0){
            return "";
        }

        return text.charAt(index) + solution(text.substring(0, index)); 
    }
}
