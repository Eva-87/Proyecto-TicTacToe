package com.tictactoe;

public class Player {

    private String name;
    private String rol;// investigar enums añadimos color
    private int win;

    // Constructors

    public Player(String name) {
        this.name = name;
    }


    // Getters&Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getWin() {
        return this.win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    
    // Methods 

    public void move(){

                //addMove()
                //checkCell()
                //cambiar aqui el jugador que juega? (pasar la pelota)
    }

}