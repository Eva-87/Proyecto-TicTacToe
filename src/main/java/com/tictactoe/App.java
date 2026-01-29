package com.tictactoe;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("______________________________________________________________________________________________________________________");

        System.out.print(Colors.RED + "\\  /  ");System.out.print(Colors.GREEN + "\\  /  "); System.out.print(Colors.BLUE + "\\  /  ");System.out.print(Colors.YELLOW + "\\  /  ");System.out.print(Colors.RED + "\\  /  ");System.out.print(Colors.GREEN + "\\  /  "); System.out.print(Colors.BLUE + "\\  /  ");System.out.print(Colors.YELLOW + "\\  /  ");System.out.print(Colors.RED + "\\  /  ");System.out.print(Colors.GREEN + "\\  /  "); System.out.print(Colors.BLUE + "\\  /  ");System.out.print(Colors.YELLOW + "\\  /  ");System.out.print(Colors.RED + "\\  /  ");System.out.print(Colors.GREEN + "\\  /  "); System.out.print(Colors.BLUE + "\\  /  ");System.out.print(Colors.YELLOW + "\\  /  ");System.out.print(Colors.RED + "\\  /  ");System.out.print(Colors.GREEN + "\\  /  "); System.out.print(Colors.BLUE + "\\  /  ");System.out.print(Colors.YELLOW + "\\  /  ");
        System.out.print(Colors.RED + "\n \\/    ");System.out.print(Colors.GREEN + "\\/    "); System.out.print(Colors.BLUE + "\\/    ");System.out.print(Colors.YELLOW + "\\/    ");System.out.print(Colors.RED + "\\/    ");System.out.print(Colors.GREEN + "\\/    "); System.out.print(Colors.BLUE + "\\/    ");System.out.print(Colors.YELLOW + "\\/    ");System.out.print(Colors.RED + "\\/    ");System.out.print(Colors.GREEN + "\\/    "); System.out.print(Colors.BLUE + "\\/    ");System.out.print(Colors.YELLOW + "\\/    ");System.out.print(Colors.RED + "\\/    ");System.out.print(Colors.GREEN + "\\/    "); System.out.print(Colors.BLUE + "\\/    ");System.out.print(Colors.YELLOW + "\\/    ");System.out.print(Colors.RED + "\\/    ");System.out.print(Colors.GREEN + "\\/    "); System.out.print(Colors.BLUE + "\\/    ");System.out.print(Colors.YELLOW + "\\/    " + Colors.RESET );
        System.out.println("\n\n\nSed bienvenidos todas y todos! Vamos a jugar a " + Colors.RED + "Tic"+Colors.GREEN +"Tac"+Colors.BLUE+ "Toe" + Colors.YELLOW +"!" + Colors.RESET+" \n\nAntes de empezar, veamos las reglas...");

        Game Game1 = new Game();
        Game1.rules(); 

        System.out.println("\nAhora que tenemos las reglas claras, me gustaria saber vuestros nombres! ");
        System.out.print("\nJugador 1, como te llamas? ");
        String name1 = scan.nextLine();
        Player Player1 = new Player(name1);
        System.out.print("\nJugador 2, como te llamas? ");
        String name2 = scan.nextLine();
        Player Player2 = new Player(name2);
        System.out.println("\n¡Genial! ¡Gracias! Pues Bienvenida/o " + Player1.getName() + "! Bienvenida/o " + Player2.getName() + "! ");

        Counter Counter = new Counter(Player1, Player2);

        Game1.startGame(Player1, Player2, scan, Counter);

        scan.close();
    }
}