package com.tictactoe;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nBienvenidas a todas y todos! hoy vamos a jugar al TicTacToe ! Antes de todo, un par de reglas...");
        // DENTRO DE RULES 

        Game game1 = new Game();
        game1.rules(); 
        // Putting the rules outside of startGame because we don't want to repeat the rules everytime they restart a game?

        System.out.println("\nAhora que tenemos las reglas claras, me gustaria saber vuestros nombres ! ");
        System.out.print("Jugador 1, como te llamas ? ");
        String name1 = scan.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Jugador 2, como te llamas ? ");
        String name2 = scan.nextLine();
        Player player2 = new Player(name2);

        System.out.println("\nGenial ! Gracias ! Pues Bienvenida " + player1.getName() + "! Bienvenida " + player2.getName() + "! ");

        System.out.println("\nBien, ahora tenemos que decidir quien va a empezar... mejor dejarlo al azar...");
        System.out.print("Toca el ENTER para lancar una moneda");
        scan.next();
        game1.designatePlayers(player1, player2);

        System.out.println("\nEs decidido, " + player1.getName() + "jugará con el " + player1.getRol() + " y el color " + player1.getColor() + "y " + player2.getName() + "jugará con el " + player2.getRol() + " y el color " +player2.getcolor() );
        
        System.out.println("Pues parace que los tenemos todo.");

        game1.startGame();

        

        Board board = new Board();
        board.printBoard();




        scan.close();
    }
}
