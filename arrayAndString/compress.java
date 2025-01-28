package arrayAndString;

public class compress {

    public static void main(String[] args) {
        System.out.println(compress("aabbcc"));
    }

    public static String compress(String s) {
        if (s == null || s.isEmpty()) {
            return s; // Empty string or null case
        }

        StringBuilder result = new StringBuilder();
        int index1 = 0;
        int index2 = 0;

        while (index2 < s.length()){
            char current = s.charAt(index1);

            if (current != s.charAt(index2)) {
                result.append(index2 - index1).append(current); // Append count and character
                index1 = index2; // Move index1 to the new character
            }
            index2++;
        }
        result.append(index2 - index1).append(s.charAt(index1));

        return result.toString();
    }

}
