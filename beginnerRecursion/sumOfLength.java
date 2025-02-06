package beginnerRecursion;

public class sumOfLength {
    public static void main(String[] args) {
        System.out.println(sumOfLength("hello"));
    }

    public static int sumOfLength(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + sumOfLength(str.substring(1));
    }
}