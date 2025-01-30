package arrayAndString;

/*
*  We used two pointers approach to solve this.
*  Pointers refer to index , we can process two elements in a loop
*  Both pointers start from their perspective index as algorithm needs
*  and moved until they meet.
*
* */

public class uncompress {

    public static void main(String[] args) {
        System.out.println(solution("2w3e4r"));
    }

    public static String solution(String s){

        int index1 = 0; // pointer to start of number
        int index2 = 0; // pointer to end of number

        StringBuilder result = new StringBuilder();

        while (index2 < s.length()){

            if (Character.isLetter(s.charAt(index2))){

                int number = Integer.parseInt(s.substring(index1,index2));
                for (int i = 0; i < number; i++) {
                    result.append(s.charAt(index2));
                }
                index1 = index2+1;
            }
            index2++;
        }

        return result.toString();
    }
}
