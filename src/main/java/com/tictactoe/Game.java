package com.tictactoe;

import java.util.List;
import java.util.Scanner;

public class Game {

    private Player PlayerX;
    private Player PlayerO;
    private Board Board;

    // Constructor

    public Game() {

        Board board = new Board();
        this.Board = board;
    }

    // Getters &setters

    public Player getPlayerX() {
        return this.PlayerX;
    }

    public void setPlayerX(Player PlayerX) {
        this.PlayerX = PlayerX;
    }

    public Player getPlayerO() {
        return this.PlayerO;
    }

    public void setPlayerO(Player PlayerO) {
        this.PlayerO = PlayerO;
    }

    public Board getBoard() {
        return this.Board;
    }

    public void setBoard(Board Board) {
        this.Board = Board;
    }

    // Methods

    public void rules() {

        String rules = """
                1. existen 2 jugadores (X - O).
                2 .El juego se juega en una cuadrícula de 3x3 el jugador X lo empieza.
                3. Un jugador gana si consigue tres X o tres O en línea vertical, horizontal o diagonal.
                4. Si se acaban los espacios del tablero y no se consiguen las líneas, se considera un empate.
                5. Al final se indica que jugador ganó o si ha sido un empate.""";
        System.out.println(rules);
    }

    public void designatePlayers(Player player1, Player player2,Scanner scan) {

        System.out.println("\nBien, veamos quien va a empezar... mejor dejarlo al azar...");
        System.out.print("Toca el ENTER para lanzar una moneda");
        scan.nextLine();

        int choice = (int) (Math.random() * 2);
        if (choice == 0) {
            player1.setRol("X");
            player1.setColor(Colors.YELLOW);
            setPlayerX(player1);
            player2.setRol("O");
            player2.setColor(Colors.PURPLE);
            setPlayerO(player2);
        } else {
            player1.setRol("O");
            player1.setColor(Colors.PURPLE);
            setPlayerX(player2);
            player2.setRol("X");
            player2.setColor(Colors.YELLOW);
            setPlayerO(player1);
        }
    }

    public boolean checkRange(String range) {
        if (range == null) {
            return false;
        } else {
            range.replace(" ", "");
            List<String> validCells = List.of(
                    "A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3",
                    "1A", "2A", "3A", "1B", "2B", "3B", "1C", "2C", "3C");
            return validCells.contains(range.toUpperCase());
        }
    }

    public int[] translateRange(String range) {
        String rangeUp = range.toUpperCase();
        int[] coordinate = new int[2];

        if (rangeUp.contains("1")) {
            coordinate[0] = 0;
        } else if (rangeUp.contains("2")) {
            coordinate[0] = 1;
        } else if (rangeUp.contains("3")) {
            coordinate[0] = 2;
        }
        if (rangeUp.contains("A")) {
            coordinate[1] = 0;
        } else if (rangeUp.contains("B")) {
            coordinate[1] = 1;
        } else if (rangeUp.contains("C")) {
            coordinate[1] = 2;
        }
        return coordinate;
    }

    
    public void startGame(Player Player1, Player Player2, Scanner scan) {
        designatePlayers(Player1, Player2, scan);
        System.out.println("\nLa suerte ha decidido que... " + Player1.getName() + "jugará con el " + Player1.getRol() + " y el color " + Player1.getColor() + ",y " + Player2.getName() + "jugará con el " + Player2.getRol() + " y el color " +Player2.getColor() + ". " + getPlayerX() + " empieza." );
        System.out.println("Pues parece que estamos listos. ¡Empezamos!");

    }
}
