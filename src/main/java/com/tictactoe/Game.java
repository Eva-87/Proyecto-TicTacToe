package com.tictactoe;

import java.awt.Color;
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
                1. Existen 2 jugadores (X - O).
                2. Se juega en un tablero de 3x3 con coordenadas; el jugador X empieza.
                3. El formato válido de las coordenadas será Letra Numero, ejemplo A1, B3, etc.
                3. Se procedera por turnos, el primer jugador colacará su ficha y pasará el turno al siguiente.
                4. Un jugador gana si consigue tres X o tres O en línea vertical, horizontal o diagonal.
                5. Si se acaban los espacios del tablero y no se consigue la victoria, se considerará un empate.
                """;
        System.out.println(rules);
    }

    public void designatePlayers(Player player1, Player player2, Scanner scan) {

        System.out.println("\nBien, veamos quien va a empezar... mejor dejarlo al azar...");
        System.out.print("Toca el ENTER para lanzar una moneda");
        scan.nextLine();

        int choice = (int) (Math.random() * 2);
        if (choice == 0) {
            
            player1.setColor(Colors.YELLOW);
            player1.setRol(player1.getColor() + "X" + Colors.RESET);
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

    public void fullBoard() {
        System.out.println(Colors.GREY + "Vaya, hay un empate" + Colors.RESET);
    }

    public void startGame(Player Player1, Player Player2, Scanner scan) {
        designatePlayers(Player1, Player2, scan);
        System.out.println("\nLa suerte ha decidido que... " + Player1.getName() + "jugará con el " + Player1.getRol()
                + " y el color " + Player1.getColor() + ",y " + Player2.getName() + "jugará con el " + Player2.getRol()
                + " y el color " + Player2.getColor() + ". " + getPlayerX() + " empieza.");
        System.out.println("Pues parece que estamos listos. ¡Empezamos!");

        boolean playAgain = true;

        while (playAgain == true) {
            designatePlayers(Player1, Player2, scan);
            Player currentPlayer = PlayerX;
            boolean gameFinished = false;
            Board.resetBoard();

            while (!gameFinished) {
                Board.printBoard();
                String range = currentPlayer.move(scan);
                if (checkRange(range) == false) {
                    System.out.println(Colors.RED + "Por favor ingresa un valor válido (A1, B3)" + Colors.RESET);
                } else {
                    int[] coordinate = translateRange(range);

                    if (Board.checkCell(coordinate) == true) {
                        Board.addMove(coordinate, currentPlayer.getRol());
                        Board.printBoard();

                        if (Board.checkWin(currentPlayer.getRol()) == true) {
                            currentPlayer.setWin(true);
                            System.out.println(Colors.GREEN + "Gana " + currentPlayer.getName() + "!" + Colors.RESET);
                            gameFinished = true;

                        } else if (Board.checkFullBoard() == true) {
                            fullBoard();
                            gameFinished = true;
                        } else {
                            if (currentPlayer.equals(PlayerX)) {
                                currentPlayer = PlayerO;
                            } else {
                                currentPlayer = PlayerX;
                            }
                        }
                    } else {
                        System.out.println(Colors.RED + "Esa casilla está ocupada, ingresa otra." + Colors.RESET);
                    }
                }
            }
            System.out.println("Otra partida? (S/N)");
            String response = scan.nextLine();

            if (!response.equalsIgnoreCase("S")) {
                playAgain = false;
                System.out.println("Gracias por jugar. Hasta la próxima.");
            }
        }
    }

}