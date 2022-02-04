package org.example;

public class Fernita extends Grandma {
    public Fernita()
    {
        super("Fernita");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() < 2)
        {
            return false;
        }
        return str.startsWith("a") || str.endsWith("a");
    }
}
