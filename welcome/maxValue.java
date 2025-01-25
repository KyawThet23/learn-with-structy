package welcome;

public class maxValue {

    public static void main(String[] args) {
        double[] numbers = { 4, 7, 2, 8, 10, 9 };
        System.out.println(getMaxValue(numbers));
    }

    public static double getMaxValue(double[] number){

        double max = Double.NEGATIVE_INFINITY;
        for (double num : number){
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
