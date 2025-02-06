package beginnerRecursion;

public class sumOfLength {
    public static void main(String[] args) {
        String[] str = {"hello","world"};
        System.out.println(sumLength(str,0));
    }

    public static int sumLength(String[] str,int index) {
        if (index >= str.length ) {
            return 0;
        }
        return str[index].length() + sumLength(str,index+1);
    }
}