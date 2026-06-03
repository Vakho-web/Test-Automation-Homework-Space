//@Author Vakho Gvishiani

package Homework5;

public class VowelCounter {

    public static int countVowels(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = Character.toLowerCase(s.charAt(i));

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String name = "Vakhtang Gvishiani";

        int result = countVowels(name);

        System.out.println("Vowels: " + result);
    }
}
