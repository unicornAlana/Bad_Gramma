package org.example;

import junit.framework.TestCase;

public class MimiTest extends TestCase {

    public void testLikesWord()
    {
        Mimi m = new Mimi();
        assertTrue(m.likesWord("statistics"));
        assertFalse(m.likesWord("glitter"));
        assertFalse(m.likesWord(""));
    }
}