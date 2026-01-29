package com.tictactoe;
import java.util.Scanner;

public class Player {

    private String name;
    private String rol;
    private String color;
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

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color =  color;
    }

   public int getWin() {
        return this.win;
    }

    public void setWin(int win) {
        this.win = win;
    }
    public void isWinner(){
        this.win = win+1;
    }

    

    
    // Methods 

    public String move(Scanner scan){
            System.out.println(this.name +", inserta coordenadas:");
            String range= scan.nextLine();
            return range;
    }
}