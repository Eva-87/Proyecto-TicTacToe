package com.tictactoe;

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
        // design a mini tablero here ?

    }

    public void designatePlayers(Player player1, Player player2){
        //Math.random()*2;
        //asignar jugadores: simbolo y color x defecto
    }
    
    public void startGame(){

        //bucle del juego
        //scanner global?? como metemos sino los inputs de movimiento??


    }

    public void checkRange(){
            //verifica el rango y TRADUCE al array

    }


}
