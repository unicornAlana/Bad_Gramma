package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    static List<String> knownWords;

    public static void main(String[] args)
     {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while((nextWord = br.readLine()) != null)
            {
                knownWords.add(nextWord);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Scanner input = new Scanner (System.in);
        Grandma grandma = new Alzora();


        System.out.println("Hello, my name is " + grandma.getName() + ".");
        System.out.println("Please give me a word, I'll let you know if I like it or not!");
        String userInput = input.nextLine();

            if (grandma.likesWord(userInput))
            {
                System.out.println("I like that word!");
            }
            else
            {
                System.out.println("I don't really like that one.");
            }
        }

    }



