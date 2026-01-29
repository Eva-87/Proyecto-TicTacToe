package com.tictactoe;

public class Counter {
private Player Player1;
private Player Player2;
private int counter;


//Constructor
public Counter(Player p1, Player p2){
    this.Player1 = p1;
    this.Player2 = p2;
    this.counter = 0;
}

    public Player getPlayer1() {
        return this.Player1;
    }

    public void setPlayer1(Player Player1) {
        this.Player1 = Player1;
    }

    public Player getPlayer2() {
        return this.Player2;
    }

    public void setPlayer2(Player Player2) {
        this.Player2 = Player2;
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addCounter(){
        this.counter = counter+1;
    }


    public void counter(){
        int draw = counter - Player1.getWin()-Player2.getWin();
        
        System.out.println("Tras un total de "+ counter +" partidas realizadas:\n" +
         Player1.getName() + " ha obtenido un total de "+ Player1.getWin() + " victorias.\n" +
         Player2.getName() + " ha obtendio un total de " + Player2.getWin() + " victorias.\n" +
         "ha habido empate en " + draw + " ocasiones.\n");
            if(Player1.getWin()<Player2.getWin()){
                System.out.println("¡El ganador definitivo es "+ Player2.getName()+ "!\n");
            } else if(Player1.getWin()>Player2.getWin()){
                 System.out.println("¡El ganador definitivo es "+ Player1.getName()+ "!\n");
            }else{
                System.out.println("Ambos jugadores han obtenido las mismas victorias.");
            }

            System.out.println("Gracias por jugar. Hasta la próxima."); 
    }
}
