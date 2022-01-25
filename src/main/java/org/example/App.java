package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello, I'm Grandma Betty");


    }

    /**
     * This method should return true if the given String has consecutive letters that are the same.
     * @param str -- the String in question.
     * @return true if str has any consecutive letters that are identical; false if not.
     */
    public static boolean hasDoubleLetters(String str) {
        return false;
    }
}
