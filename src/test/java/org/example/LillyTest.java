package org.example;

import junit.framework.TestCase;

public class LillyTest extends TestCase {

    public void testLikesWord()
    {
        Lilly l = new Lilly();
        assertTrue(l.likesWord("candy"));
        assertFalse(l.likesWord("hummingbird"));
        assertFalse(l.likesWord(""));
    }
}