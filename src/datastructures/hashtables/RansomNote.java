package datastructures.hashtables;

import java.util.Hashtable;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};

        Map<String, Integer> magazineFrequency = getWordFrequency(magazine);
        Map<String, Integer> noteFrequency = getWordFrequency(note);

        String result = "No";
        if(hasEnoughWords(magazineFrequency, noteFrequency)) {
            result = "Yes";
        } else {
            result = "No";
        }

        System.out.println(result);
    }

    public static Map<String, Integer> getWordFrequency(String[] words) {
        Map<String, Integer> result = new Hashtable<>();

        for(String word : words) {
            if(!result.containsKey(word)) {
                result.put(word, 0);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }

        return result;
    }

    public static boolean hasEnoughWords(Map<String, Integer> magFreq, Map<String, Integer> noteFreq) {
        for(Map.Entry<String, Integer> entry : noteFreq.entrySet()) {
            String word = entry.getKey();

            if(!magFreq.containsKey(word) || magFreq.get(word) < entry.getValue()) {
                return false;
            }
        }

        return true;
    }
}
