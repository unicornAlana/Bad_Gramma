package org.example;

public class Margaret extends Grandma {
    public Margaret()
    {
        super("Margaret");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() < 2)
        {
            return false;
        }
        return str.length() > 7 && str.indexOf("e") > -1;
    }
}