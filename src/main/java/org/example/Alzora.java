package org.example;

public class Alzora extends Grandma {
    public Alzora()
    {
        super("Alzora");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() < 2)
        {
            return false;
        }
        return str.charAt(0) == str.charAt(str.length()-1);
    }
}