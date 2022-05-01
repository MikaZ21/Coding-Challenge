package javaChallenge;

import java.util.*;

// Have the function LongestWord(sen) take the sen parameter being passed and
// return the longest word in the string. If there are two or more words that
// are the same length, return the first word from the string with that length.
// Ignore punctuation and assume sen will not be empty. Words may also contain
// numbers, for example "Hello world123 567"

class Class4 {

    public static String LongestWord(String sen) {
        // code goes here
        String[] words = sen.split(" ");
        String longest = null;
        for (String word : words) {
            if (longest == null || longest.length() < word.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}