//@author Vakho Gvishiani

package homework9;

import java.util.HashMap;

public class WordCounter {

    public static void main(String[] args) {

        String sentence = "java vakho lazare vakho git java oop javascript vakho java git python";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        System.out.println(freq);
    }
}
