package com.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
    

    // checkRange()

    @Test
    public void testInRange(){

        Game game = new Game();
        String rangeIn = "A1";

        boolean result = game.checkRange(rangeIn);

        assertTrue(result);

    }

    @Test
    public void testOutRange(){

        Game game = new Game();
        String rangeOut = "A5";

        boolean result = game.checkRange(rangeOut);

        assertFalse(result);

    }

}