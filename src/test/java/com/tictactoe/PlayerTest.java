package com.tictactoe;

import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.Test;

public class PlayerTest {

    // move()

    @Test
    public void testPlayerMove(){

    Player player = new Player("Nucelar");
    String fakeIn = "A1";
    Scanner fakeScanner = new Scanner(fakeIn);

    String result = player.move(fakeScanner);

    assertEquals("A1", result);
    }


    @Test
    public void testDiffMoves(){

    Player player = new Player("Nucelar");
    String fakeIn1 = "A1";
    String fakeIn2 = "A2";
    Scanner fakeScanner1 = new Scanner(fakeIn1);
    Scanner fakeScanner2 = new Scanner(fakeIn2);

    String result1 = player.move(fakeScanner1);
    String result2 = player.move(fakeScanner2);

    assertNotEquals(result1,result2);
    }
    
}