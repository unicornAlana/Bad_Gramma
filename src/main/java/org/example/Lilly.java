package org.example;

public class Lilly extends Grandma {
    public Lilly() {
        super("Lilly");
    }

    @Override
    public boolean likesWord(String str)
    {
        if (str.length() < 2)
        {
            return false;
        }
        return str.length() == 5;
    }
}