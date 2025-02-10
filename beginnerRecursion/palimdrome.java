package beginnerRecursion;

public class palimdrome {

    public static void main(String[] args) {
        System.out.println(solution("roar", 0));
    }

    private static boolean solution(String text , int index){

        int lastIndex = text.length() - 1;
        if(text.length() <= 1 ){
            return true;
        }

        return (text.charAt(index) == text.charAt(text.length() - 1)) 
        && solution(text.substring(index+1, lastIndex), 0);
    } 
    
}
