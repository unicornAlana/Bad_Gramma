package org.example;

import junit.framework.TestCase;

public class MargaretTest extends TestCase {

    public void testLikesWord()
    {
        Margaret m = new Margaret();
        assertTrue(m.likesWord("butterfly"));
        assertFalse(m.likesWord("pink"));
        assertFalse(m.likesWord(""));
    }
}