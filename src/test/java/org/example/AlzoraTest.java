package org.example;

import junit.framework.TestCase;

public class AlzoraTest extends TestCase {

    public void testLikesWord() 
    {
        Alzora a = new Alzora();
        assertTrue(a.likesWord("stars"));
        assertFalse(a.likesWord("cupcakes"));
        assertFalse(a.likesWord(""));
    }
}