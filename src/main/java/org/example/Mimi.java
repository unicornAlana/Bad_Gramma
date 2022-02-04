package org.example;

public class Mimi extends Grandma {
    public Mimi() {
        super("Mimi");
    }

    @Override
    public boolean likesWord(String str)
    {
        if (str.length() < 2)
        {
            return false;
        }
        return str.charAt(1) == str.charAt(3);
    }
}