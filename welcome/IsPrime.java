package welcome;

public class IsPrime {

    // Big O notation is O(sqrt(n))

    public static void main(String[] args) {
        int input = 101;
        System.out.println(primeOrNot(input));
        System.out.println(Math.sqrt(input));
    }

    public static boolean primeOrNot(int input){

        boolean result = input >= 2;

        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                result = false;
            }
        }

        return result;
    }
}
