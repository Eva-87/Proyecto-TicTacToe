package com.tictactoe;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nBienvenidas a todas y todos! hoy vamos a jugar al TicTacToe ! Antes de todo, un par de reglas...");

        Game Game1 = new Game();
        Game1.rules(); 

        System.out.println("\nAhora que tenemos las reglas claras, me gustaria saber vuestros nombres ! ");
        System.out.print("Jugador 1, como te llamas ? ");
        String name1 = scan.nextLine();
        Player Player1 = new Player(name1);
        System.out.print("Jugador 2, como te llamas ? ");
        String name2 = scan.nextLine();
        Player Player2 = new Player(name2);
        System.out.println("\nGenial ! Gracias ! Pues Bienvenida " + Player1.getName() + "! Bienvenida " + Player2.getName() + "! ");

        Game1.startGame(Player1, Player2, scan);

        scan.close();
    }
}