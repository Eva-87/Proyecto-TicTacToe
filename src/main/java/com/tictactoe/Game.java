package com.tictactoe;

import java.util.List;
import java.util.Scanner;

public class Game {

    private Player PlayerX;
    private Player PlayerO;
    private Board Board;

    //Constructor
    public Game(){

        Board board = new Board();
        this.Board = board;
    }

        //Getters &setters

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


        //métodos
    public void rules(){
        System.out.println("REGLAS");

    }

    public void designatePlayers(Player player1, Player player2){
        int choice = (int) (Math.random() * 2);
        if (choice == 0){
            player1.setRol("X");
            player1.setColour("color");
            setPlayerX(player1);
            player2.setRol("O");
            player2.setColour("color");
            setPlayerO(player2);
            System.out.println("empieza "+ player1.getName());
        }else{
            player1.setRol("O");
            player1.setColour("color");
            setPlayerX(player2);
            player2.setRol("X");
            player1.setColour("color");
            setPlayerO(player1);
            System.out.println("empieza "+ player2.getName());
        }
    }
    
    public void startGame(Scanner scan){
        String range = PlayerX.move(scan);
        if (checkRange(range) == false){
            System.out.println("ingresa un valor válido");
        } else{
            int[] coordinate = new int[2];
            coordinate = translateRange(range);
            
        }


        

        //bucle del juego
        //scanner global?? como metemos sino los inputs de movimiento??


    }

    public boolean checkRange(String range){
           if (range == null) {
            return false;
           }else
            {
            List<String> validCells = List.of(
                 "A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3",
                 "1A", "2A", "3A", "1B", "2B", "3B", "1C", "2C", "3C"
                 );
             return validCells.contains(range.toUpperCase());

           }
    }

    public int[] translateRange(String range){
       String rangeUp = range.toUpperCase();
       int[] coordinate = new int[2];
    
       if (rangeUp.contains("1")){
            coordinate[0] = 0;
            }else if (rangeUp.contains("2")){
                    coordinate[0] = 1;
            }else if (rangeUp.contains("3")){
                    coordinate[0] = 2;
        }
        if(rangeUp.contains("A")){
                coordinate[1] = 0;
            }else if (rangeUp.contains("B")){
                    coordinate[1] = 1;
            }else if (rangeUp.contains("C")){
                    coordinate[1] = 2;
        }
       return coordinate;
    }

    public void fullBoard(){
        
    System.out.println("Vaya, hay un empate");
    }
}
