package beginnerRecursion;

public class fibonacci {

    public static void main(String[] args) {
        // 0 , 1 , 1 , 2 , 3 , 5 => 5
        System.out.println(solution(6));
    }

    private static int solution(int n){

        if(n <= 1){
            return n;
        }

        return solution(n - 1) + solution(n - 2);
    }
}
