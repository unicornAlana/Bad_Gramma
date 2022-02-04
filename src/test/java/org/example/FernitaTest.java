package org.example;

import junit.framework.TestCase;

public class FernitaTest extends TestCase {

    public void testLikesWord()
    {
        Fernita f = new Fernita();
        assertTrue(f.likesWord("pasta"));
        assertFalse(f.likesWord("chocolate"));
        assertFalse(f.likesWord(""));
    }
}