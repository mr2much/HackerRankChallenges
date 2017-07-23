package string.manipulation;

public class Anagrams {

    public static void main(String[] args) {
        numberNeeded("cdegghfbca", "bcjkl");
    }

    public static int numberNeeded(String first, String second) {
        int result = 0;
        int[] charFrequency = new int[26];  // english alphabet has 26 letters

        int index;
        for(int i = 0; i < first.length(); i++) {
            index = first.charAt(i) - 'a';

            charFrequency[index]++;
        }

        // decrease common characters between the two strings
        for(int i = 0; i < second.length(); i++) {
            index = second.charAt(i) - 'a';

            charFrequency[index]--;
        }

        for(int i = 0; i < charFrequency.length; i++) {
            System.out.print(charFrequency[i] + " ");
            result += Math.abs(charFrequency[i]);
        }

        System.out.println(result);


        return result;
    }

    public static String findCommonString(String first, String second) {
        String result = "";

        for(int i = 0; i < first.length(); i++) {
            for(int j = 0; j < second.length(); j++) {
                if(first.charAt(i) == second.charAt(j)) {
                    result += first.charAt(i);
                }
            }
        }

        return result;
    }
}
