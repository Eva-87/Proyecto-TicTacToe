package com.tictactoe;

import java.util.Scanner;

public class Player {

    private String name;
    private String rol;// investigar enums añadimos color
    private String colour;
    private boolean win;

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

   public boolean getWin() {
        return this.win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    
    // Methods 

    public String move(Scanner scan){
            System.out.println("jugador "+this.name +"inserta coordenadas");
            String range= scan.nextLine();
            return range;
               
    }

}