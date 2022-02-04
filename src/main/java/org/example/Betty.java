package org.example;

public class Betty extends Grandma {
    public Betty()
    {
        super("Betty");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() < 2)
        {
            return false;
        }
        String sub = str.substring((str.length()-1));
        return (str.startsWith(sub));
    }
}
