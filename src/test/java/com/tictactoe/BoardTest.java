package com.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

    // checkCell()

    @Test 
    public void testcheckCellDisp(){
        
        Board board = new Board();
        int[] coordinate = {0,0};

        boolean result = board.checkCell(coordinate);

        assertTrue(result);
    }


    @Test 
    public void testcheckCellNotDisp(){
        
        Board board = new Board();
        int[] coordinate = {1,1};
        board.addMove(coordinate, "X");

        boolean result = board.checkCell(coordinate);

        assertFalse(result);
    }
    
}